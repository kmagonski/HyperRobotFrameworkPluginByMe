package com.github.jnhyperion.hyperrobotframeworkplugin.psi;

import com.github.jnhyperion.hyperrobotframeworkplugin.ide.icons.RobotIcons;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author mrubino
 */
public class RobotResourceFileType extends LanguageFileType {

    private static final RobotResourceFileType INSTANCE = new RobotResourceFileType();

    private RobotResourceFileType() {
        super(RobotLanguage.INSTANCE);
    }

    public static RobotResourceFileType getInstance() {
        return INSTANCE;
    }

    @NotNull
    public String getName() {
        return "Robot Resource File";
    }

    @NotNull
    public String getDescription() {
        return "Robot resource files for keywords and variables";
    }
    @NotNull
    public String getDefaultExtension() {
        return "resource";
    }

    @Nullable
    public Icon getIcon() {
        return RobotIcons.RESOURCE;
    }
}
