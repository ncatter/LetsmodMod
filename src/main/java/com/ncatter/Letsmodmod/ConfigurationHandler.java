package com.ncatter.Letsmodmod;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        try{
            configuration.load();

            //Read the needed config values  category is a string and can be set to whatever
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example of getting config value").getBoolean(true);
        }
        catch (Exception e){

        }
        finally
        {
            configuration.save();
        }
    }
}
