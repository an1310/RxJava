/**
 * Copyright (c) 2016-present, RxJava Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */

package io.reactivex.tck;

import org.reactivestreams.Publisher;
import org.testng.annotations.Test;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

@Test
public class PublishSelectorTckTest extends BaseTck<Integer> {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public Publisher<Integer> createPublisher(long elements) {
        return FlowableTck.wrap(
                Flowable.range(0, (int)elements).publish((Function)Functions.identity())
        );
    }
}
