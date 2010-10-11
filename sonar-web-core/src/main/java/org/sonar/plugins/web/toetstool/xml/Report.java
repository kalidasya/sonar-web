/*
 * Copyright (C) 2010 Matthijs Galesloot
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sonar.plugins.web.toetstool.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * @author Matthijs Galesloot
 * @since 0.2
 */
public class Report {

  @XStreamAlias("guideline")
  private class Guidelines {

    @XStreamImplicit(itemFieldName = "guideline")
    private List<Guideline> guidelines;

    public List<Guideline> getGuidelines() {
      return guidelines;
    }
  }

  @XStreamAsAttribute
  private Counters counters;

  @XStreamAsAttribute
  private String date;

  @XStreamAsAttribute
  private Guidelines guidelines;

  @XStreamAsAttribute
  private Integer score;

  @XStreamAsAttribute
  private String url;

  public Counters getCounters() {
    return counters;
  }

  public String getDate() {
    return date;
  }

  public List<Guideline> getGuidelines() {
    return guidelines.getGuidelines();
  }

  public Integer getScore() {
    return score;
  }

  public String getUrl() {
    return url;
  }
}