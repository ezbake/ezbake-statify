/*   Copyright (C) 2013-2014 Computer Sciences Corporation
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
 * limitations under the License. */

package ezbake.core.statify;

import org.apache.thrift.TBase;

import com.codahale.metrics.Gauge;

/**
 * Extend this class to use Gauges and then 
 * use {@code populateStat(stat)} to update stats. 
 * @param <T>
 */
public abstract class StatifyGauge<T> implements Gauge<T> {
    
    @Override
    public abstract T getValue();
    
    public abstract boolean populateStat(TBase stat);
    
}
