/*
 * Copyright (c) 2015-2017 Dzikoysk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.panda_lang.panda.language.structure.overall.imports;

import org.panda_lang.panda.language.structure.overall.module.Module;
import org.panda_lang.panda.language.structure.prototype.structure.ClassPrototype;

import java.util.ArrayList;
import java.util.Collection;

public class ImportRegistry {

    private final Collection<Module> importedModules;

    public ImportRegistry() {
        this.importedModules = new ArrayList<>();
    }

    public void include(Module module) {
        this.importedModules.add(module);
    }

    public ClassPrototype forClass(String className) {
        for (Module module : importedModules) {
            ClassPrototype prototype = module.get(className);

            if (prototype != null) {
                return prototype;
            }
        }

        return null;
    }

}