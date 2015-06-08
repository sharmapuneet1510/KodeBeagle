/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.imaginea.betterdocs.action;

import com.imaginea.betterdocs.object.WindowObjects;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import javax.swing.JTree;

public class CollapseProjectTreeAction extends AnAction {
    private WindowObjects windowObjects = WindowObjects.getInstance();
    private static final String COLLAPSE_TREE = "Collapse Tree";

    public CollapseProjectTreeAction() {
        super(COLLAPSE_TREE, COLLAPSE_TREE, AllIcons.General.CollapseAll);
    }

    @Override
    public final void actionPerformed(final AnActionEvent anActionEvent) {
        JTree jTree = windowObjects.getjTree();

        for (int i = 0; i < jTree.getRowCount(); i++) {
            jTree.collapsePath(jTree.getPathForRow(i));
        }
        jTree.updateUI();
    }
}