package com.github.jnhyperion.hyperrobotframeworkplugin.ide.icons;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.util.IconLoader;
import com.intellij.ui.IconManager;

import javax.swing.*;

/**
 * @author mrubino
 * @since 2016-01-28
 */
public class RobotIcons {

    public static final Icon FILE = IconManager.getInstance().getIcon("/images/robot.png", RobotIcons.class);
    public static final Icon RESOURCE = IconManager.getInstance().getIcon("/images/resource.png", RobotIcons.class);

    public static final Icon HEADING = AllIcons.Nodes.Tag;
    public static final Icon KEYWORD_DEFINITION = AllIcons.Nodes.Method;
    public static final Icon TEST_CASE = AllIcons.RunConfigurations.Junit;
    public static final Icon VARIABLE_DEFINITION = AllIcons.Nodes.Variable;

    private RobotIcons() {
    }
}
