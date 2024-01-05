[33mcommit e2f31e131657c5dec7e31f0060bd559b7f33173e[m[33m ([m[1;36mHEAD[m[33m -> [m[1;32mmain[m[33m)[m
Author: Tuncer Özgür <tuncer_ozgur@icloud.com>
Date:   Sat Jan 6 00:26:08 2024 +0300

    JDBC

[1mdiff --git a/.idea/misc.xml b/.idea/misc.xml[m
[1mindex accd629..20e4bc5 100644[m
[1m--- a/.idea/misc.xml[m
[1m+++ b/.idea/misc.xml[m
[36m@@ -7,8 +7,9 @@[m
         <option value="$PROJECT_DIR$/pom.xml" />[m
       </list>[m
     </option>[m
[32m+[m[32m    <option name="workspaceImportForciblyTurnedOn" value="true" />[m
   </component>[m
[31m-  <component name="ProjectRootManager" version="2" languageLevel="JDK_11" default="true" project-jdk-name="11" project-jdk-type="JavaSDK">[m
[32m+[m[32m  <component name="ProjectRootManager" version="2" languageLevel="JDK_21" default="true" project-jdk-name="openjdk-21" project-jdk-type="JavaSDK">[m
     <output url="file://$PROJECT_DIR$/out" />[m
   </component>[m
 </project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/uiDesigner.xml b/.idea/uiDesigner.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..2b63946[m
[1m--- /dev/null[m
[1m+++ b/.idea/uiDesigner.xml[m
[36m@@ -0,0 +1,124 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="Palette2">[m
[32m+[m[32m    <group name="Swing">[m
[32m+[m[32m      <item class="com.intellij.uiDesigner.HSpacer" tooltip-text="Horizontal Spacer" icon="/com/intellij/uiDesigner/icons/hspacer.svg" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="1" hsize-policy="6" anchor="0" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="com.intellij.uiDesigner.VSpacer" tooltip-text="Vertical Spacer" icon="/com/intellij/uiDesigner/icons/vspacer.svg" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="1" anchor="0" fill="2" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JPanel" icon="/com/intellij/uiDesigner/icons/panel.svg" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JScrollPane" icon="/com/intellij/uiDesigner/icons/scrollPane.svg" removable="false" auto-create-binding="false" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="7" hsize-policy="7" anchor="0" fill="3" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JButton" icon="/com/intellij/uiDesigner/icons/button.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="3" anchor="0" fill="1" />[m
[32m+[m[32m        <initial-values>[m
[32m+[m[32m          <property name="text" value="Button" />[m
[32m+[m[32m        </initial-values>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JRadioButton" icon="/com/intellij/uiDesigner/icons/radioButton.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />[m
[32m+[m[32m        <initial-values>[m
[32m+[m[32m          <property name="text" value="RadioButton" />[m
[32m+[m[32m        </initial-values>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JCheckBox" icon="/com/intellij/uiDesigner/icons/checkBox.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />[m
[32m+[m[32m        <initial-values>[m
[32m+[m[32m          <property name="text" value="CheckBox" />[m
[32m+[m[32m        </initial-values>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JLabel" icon="/com/intellij/uiDesigner/icons/label.svg" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="0" anchor="8" fill="0" />[m
[32m+[m[32m        <initial-values>[m
[32m+[m[32m          <property name="text" value="Label" />[m
[32m+[m[32m        </initial-values>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTextField" icon="/com/intellij/uiDesigner/icons/textField.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">[m
[32m+[m[32m          <preferred-size width="150" height="-1" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JPasswordField" icon="/com/intellij/uiDesigner/icons/passwordField.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">[m
[32m+[m[32m          <preferred-size width="150" height="-1" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JFormattedTextField" icon="/com/intellij/uiDesigner/icons/formattedTextField.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">[m
[32m+[m[32m          <preferred-size width="150" height="-1" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTextArea" icon="/com/intellij/uiDesigner/icons/textArea.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTextPane" icon="/com/intellij/uiDesigner/icons/textPane.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JEditorPane" icon="/com/intellij/uiDesigner/icons/editorPane.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JComboBox" icon="/com/intellij/uiDesigner/icons/comboBox.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="2" anchor="8" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTable" icon="/com/intellij/uiDesigner/icons/table.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JList" icon="/com/intellij/uiDesigner/icons/list.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hs