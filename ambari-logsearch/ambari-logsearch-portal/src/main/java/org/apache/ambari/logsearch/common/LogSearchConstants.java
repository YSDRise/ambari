/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.ambari.logsearch.common;

public class LogSearchConstants {
  // Log Levels
  public static final String INFO = "INFO";
  public static final String WARN = "WARN";
  public static final String DEBUG = "DEBUG";
  public static final String ERROR = "ERROR";
  public static final String TRACE = "TRACE";
  public static final String FATAL = "FATAL";
  public static final String UNKNOWN = "UNKNOWN";
  
  public static final String[] SUPPORTED_LOG_LEVEL ={FATAL,ERROR,WARN,INFO,DEBUG,TRACE,UNKNOWN};

  // Application Constants
  public static final String HOST = "H";
  public static final String COMPONENT = "C";
  public static final String SCROLL_TYPE_AFTER = "after";
  public static final String SCROLL_TYPE_BEFORE = "before";

  // UserConfig Constants
  public static final String ID = "id";
  public static final String USER_NAME = "username";
  public static final String VALUES = "jsons";
  public static final String FILTER_NAME = "filtername";
  public static final String ROW_TYPE = "rowtype";
  public static final String COMPOSITE_KEY = "composite_filtername-username";
  public static final String SHARE_NAME_LIST = "share_username_list";

  // SOLR Document Constants for ServiceLogs
  public static final String BUNDLE_ID = "bundle_id";
  public static final String LOGTIME = "logtime";
  public static final String SEQUNCE_ID = "seq_num";
  public static final String SOLR_COMPONENT = "type";
  public static final String SOLR_LOG_MESSAGE = "log_message";
  public static final String SOLR_KEY_LOG_MESSAGE = "key_log_message";
  public static final String SOLR_HOST = "host";
  public static final String SOLR_LEVEL = "level";
  public static final String SOLR_THREAD_NAME = "thread_name";
  public static final String SOLR_LOGGER_NAME = "logger_name";
  public static final String SOLR_FILE = "file";
  public static final String SOLR_LINE_NUMBER = "line_number";
  public static final String SOLR_PATH = "path";

  //SOLR Document Constant for audit log
  public static final String AUDIT_COMPONENT = "repo";
  public static final String AUDIT_EVTTIME = "evtTime";
  public static final String AUDIT_REQUEST_USER = "reqUser";

  // Operator's
  public static final String MINUS_OPERATOR = "-";
  public static final String NO_OPERATOR = "";

  //operation
  public static final String EXCLUDE_QUERY = "excludeQuery";
  public static final String INCLUDE_QUERY = "includeQuery";

  // Seprator's
  public static final String I_E_SEPRATOR = "\\|i\\:\\:e\\|";

  //SUFFIX
  public static final String UI_SUFFIX = "@UI@";
  public static final String SOLR_SUFFIX = "@Solr@";
  public static final String NGRAM_SUFFIX = "ngram_";

  //Date Format for SOLR
  public static final String SOLR_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss,SSS";
  public static final String SOLR_DATE_FORMAT_PREFIX_Z = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

  //Solr Order By
  public static final String ASCENDING_ORDER = "asc";
  public static final String DESCENDING_ORDER = "desc";

  //Solr Facet Sort By
  public static final String FACET_INDEX = "index";
  public static final String FACET_COUNT = "count";

  // logfeeder 
  public static final String LOGFEEDER_FILTER_NAME = "log_feeder_config";
  public static final String LIST_SEPARATOR = ",";
  
  public static final String SORT = "sort";
  public static final String FL = "fl";
  
  //Facet Constant
  public static final String FACET_FIELD = "facet.field";
  public static final String FACET_MINCOUNT = "facet.mincount";
  public static final String FACET_JSON_FIELD = "json.facet";
  public static final String FACET_PIVOT = "facet.pivot";
  public static final String FACET_PIVOT_MINCOUNT = "facet.pivot.mincount";
  public static final String FACET_DATE = "facet.date";
  public static final String FACET_DATE_START = "facet.date.start";
  public static final String FACET_DATE_END = "facet.date.end";
  public static final String FACET_DATE_GAP = "facet.date.gap";
  public static final String FACET_RANGE = "facet.range";
  public static final String FACET_RANGE_START = "facet.range.start";
  public static final String FACET_RANGE_END = "facet.range.end";
  public static final String FACET_RANGE_GAP = "facet.range.gap";
  public static final String FACET_GROUP = "group";
  public static final String FACET_GROUP_MAIN = "group.main";
  public static final String FACET_GROUP_FIELD = "group.field";

  // Request params
  public static final String REQUEST_PARAM_QUERY = "q";
  public static final String REQUEST_PARAM_XAXIS = "xAxis";
  public static final String REQUEST_PARAM_YAXIS = "yAxis";
  public static final String REQUEST_PARAM_STACK_BY = "stackBy";
  public static final String REQUEST_PARAM_UNIT = "unit";
  public static final String REQUEST_PARAM_BUNDLE_ID = "bundle_id";
  public static final String REQUEST_PARAM_START_INDEX = "startIndex";
  public static final String REQUEST_PARAM_PAGE = "page";
  public static final String REQUEST_PARAM_PAGE_SIZE = "pageSize";
  public static final String REQUEST_PARAM_SORT_BY = "sortBy";
  public static final String REQUEST_PARAM_SORT_TYPE = "sortType";
  public static final String REQUEST_PARAM_START_TIME = "start_time";
  public static final String REQUEST_PARAM_END_TIME = "end_time";
  public static final String REQUEST_PARAM_FROM = "from";
  public static final String REQUEST_PARAM_TO = "to";
  public static final String REQUEST_PARAM_FIELD = "field";
  public static final String REQUEST_PARAM_FORMAT = "format";
  public static final String REQUEST_PARAM_LAST_PAGE = "lastPage";
  public static final String REQUEST_PARAM_I_MESSAGE = "iMessage";
  public static final String REQUEST_PARAM_E_MESSAGE = "eMessage";
  public static final String REQUEST_PARAM_MUST_BE = "mustBe";
  public static final String REQUEST_PARAM_MUST_NOT = "mustNot";
  public static final String REQUEST_PARAM_INCLUDE_QUERY = "includeQuery";
  public static final String REQUEST_PARAM_EXCLUDE_QUERY = "excludeQuery";
  public static final String REQUEST_PARAM_ID = "id";
  public static final String REQUEST_PARAM_SCROLL_TYPE = "scrollType";
  public static final String REQUEST_PARAM_NUMBER_ROWS = "numberRows";
  public static final String REQUEST_PARAM_LEVEL = "level";
  public static final String REQUEST_PARAM_HOST_NAME = "host_name";
  public static final String REQUEST_PARAM_COMPONENT_NAME = "component_name";
  public static final String REQUEST_PARAM_FILE_NAME = "file_name";
  public static final String REQUEST_PARAM_DATE_RANGE_LABEL = "dateRangeLabel";
  public static final String REQUEST_PARAM_KEYWORD = "find";
  public static final String REQUEST_PARAM_SOURCE_LOG_ID = "sourceLogId";
  public static final String REQUEST_PARAM_KEYWORD_TYPE = "keywordType";
  public static final String REQUEST_PARAM_TOKEN = "token";
  public static final String REQUEST_PARAM_USER_ID = "userId";
  public static final String REQUEST_PARAM_FILTER_NAME = "filterName";
  public static final String REQUEST_PARAM_ROW_TYPE = "rowType";
  public static final String REQUEST_PARAM_UTC_OFFSET = "utcOffset";


}