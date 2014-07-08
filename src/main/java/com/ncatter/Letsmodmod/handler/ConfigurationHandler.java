package com.ncatter.Letsmodmod.handler;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    public static void init(File configFile)
    {
         configuration = new Configuration(configFile);

        try{
            configuration.load();

            //Read the needed config values  category is a string and can be set to whatever
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example of getting config value").getBoolean(true);
        }
        catch (Exception e){

        }
        finally
        {
            if(configuration.hasChanged())
            {
                configuration.save();
            }
        }
    }
}
