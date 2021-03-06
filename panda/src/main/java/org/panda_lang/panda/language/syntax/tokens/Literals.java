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

package org.panda_lang.panda.language.syntax.tokens;

import org.panda_lang.panda.framework.language.interpreter.token.defaults.Literal;

/**
 * Default literals
 */
public class Literals {

    public static final Literal FALSE = new Literal("false");

    public static final Literal TRUE = new Literal("true");

    public static final Literal NULL = new Literal("null");

    private static final Literal[] VALUES = new Literal[3];

    static {
        VALUES[0] = FALSE;
        VALUES[1] = TRUE;
        VALUES[2] = NULL;
    }

    public static Literal[] values() {
        return VALUES;
    }

}
