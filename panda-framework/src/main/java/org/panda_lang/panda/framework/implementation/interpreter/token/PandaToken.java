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

package org.panda_lang.panda.framework.implementation.interpreter.token;

import org.panda_lang.panda.framework.language.interpreter.token.TokenType;
import org.panda_lang.panda.framework.language.interpreter.token.defaults.EqualableToken;

public class PandaToken extends EqualableToken {

    private final TokenType type;
    private final String name;
    private final String token;

    public PandaToken(TokenType type, String token) {
        this(type, type.getTypeName(), token);
    }

    public PandaToken(TokenType type, String name, String token) {
        this.type = type;
        this.token = token;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTokenValue() {
        return token;
    }

    @Override
    public TokenType getType() {
        return type;
    }

    @Override
    public String toString() {
        return getType().getTypeName().toLowerCase() + ": " + getTokenValue();
    }

}
