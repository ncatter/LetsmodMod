package com.ncatter.Letsmodmod;

import com.ncatter.Letsmodmod.proxy.IProxy;
import com.ncatter.Letsmodmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION)
public class LetsmodMod
{

    @Mod.Instance(Reference.MOD_ID)
    public static LetsmodMod instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide=Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent)
    {
        ConfigurationHandler.init(preInitEvent.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent initEvent)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postInitEvent)
    {

    }
}
