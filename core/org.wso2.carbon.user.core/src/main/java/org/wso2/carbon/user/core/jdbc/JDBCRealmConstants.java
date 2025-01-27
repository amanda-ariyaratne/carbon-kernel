/*
 * Copyright (c) 2005-2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
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
package org.wso2.carbon.user.core.jdbc;

public final class JDBCRealmConstants {

    public static final String SELECT_USER = "SelectUserSQL";
    public static final String SELECT_USER_NAME = "SelectUserNameSQL";
    public static final String SELECT_USER_ID_WITH_ID = "SelectUserIDWithIDSQL";
    public static final String SELECT_USER_WITH_ID = "SelectUserWithIDSQL";
    public static final String SELECT_USER_ID_FROM_USER_NAME = "SelectUserIDFromUserNameSQL";
    public static final String SELECT_USER_NAME_FROM_USER_ID = "SelectUserNameFromUserIDSQL";
    public static final String SELECT_USER_ID = "SelectUserIDSQL";
    public static final String GET_ROLE_LIST = "GetRoleListSQL";
    public static final String GET_ROLE_LIST_H2 = "GetRoleListSQLH2";
    public static final String GET_ROLE_LIST_WITH_ESCAPE = "GetRoleListSQLWithEscape";
    public static final String GET_ROLE_LIST_WITH_ESCAPE_H2 = "GetRoleListSQLWithEscapeH2";
    public static final String GET_ROLE_ID_BY_NAME = "GetRoleIDByNameSQL";
    public static final String GET_SHARED_ROLE_LIST = "GetSharedRoleListSQL";
    public static final String GET_SHARED_ROLE_LIST_H2 = "GetSharedRoleListSQLH2";
    public static final String GET_USER_FILTER = "UserFilterSQL";
    public static final String GET_USER_FILTER_WITH_ID = "UserFilterWithIDSQL";
    public static final String GET_USER_FILTER_WITH_ID_WITH_ESCAPE = "UserFilterWithIDWithEscapeSQL";
    public static final String GET_USER_FILTER_WITH_ESCAPE = "UserFilterSQLWithEscape";
    public static final String GET_USER_FILTER_PAGINATED = "UserFilterPaginatedSQL";
    public static final String GET_USER_FILTER_PAGINATED_WITH_ID = "UserFilterPaginatedWithIDSQL";
    public static final String GET_USER_FILTER_PAGINATED_MSSQL = "UserFilterPaginatedSQL-mssql";
    public static final String GET_USER_FILTER_PAGINATED_DB2 = "UserFilterPaginatedSQL-db2";
    public static final String GET_USER_FILTER_PAGINATED_ORACLE = "UserFilterPaginatedSQL-oracle";
    public static final String GET_USER_FILTER_PAGINATED_COUNT = "UserFilterPaginatedCountSQL";
    public static final String GET_USER_FILTER_PAGINATED_COUNT_WITH_ID = "UserFilterPaginatedCountWithIDSQL";
    public static final String GET_USER_ROLE = "UserRoleSQL";
    public static final String GET_USER_ROLE_WITH_ID = "UserRoleWithIDSQL";
    public static final String GET_IS_USER_ROLE_EXIST = "UserRoleExistSQL";
    public static final String GET_IS_USER_ROLE_EXIST_WITH_ID = "UserRoleExistWithIDSQL";
    public static final String GET_USERS_ROLE = "UsersRoleSQL";
    public static final String GET_USERS_ROLE_WITH_ID = "UsersRoleWithIDSQL";
    public static final String GET_SHARED_ROLES_FOR_USER = "UserSharedRoleSQL";
    public static final String GET_SHARED_ROLES_FOR_USER_WITH_ID = "UserSharedRoleWithIDSQL";
    public static final String GET_IS_ROLE_EXISTING = "IsRoleExistingSQL";
    public static final String GET_USERS_IN_ROLE = "GetUserListOfRoleSQL";
    public static final String GET_USERS_IN_ROLE_FILTER = "GetUserListOfRoleFilterSQL";
    public static final String GET_USERS_IN_ROLE_FILTER_WITH_ID = "GetUserListOfRoleFilterWithIDSQL";
    public static final String GET_USERS_COUNT_WITH_FILTER_ROLE = "GetUserCountWithFilterRoleSQL";
    public static final String GET_USERS_COUNT_WITH_FILTER_ROLE_WITH_ID = "GetUserCountWithFilterRoleWithIDSQL";
    public static final String GET_USERS_IN_SHARED_ROLE = "GetUserListOfSharedRoleSQL";
    public static final String GET_USERS_IN_SHARED_ROLE_FILTER = "GetUserListOfSharedRoleFilterSQL";
    public static final String GET_USERS_IN_SHARED_ROLE_FILTER_WITH_ID = "GetUserListOfSharedRoleFilterWithIDSQL";
    public static final String GET_IS_USER_EXISTING = "IsUserExistingSQL";
    public static final String GET_IS_USER_EXISTING_WITH_ID = "IsUserExistingWithIDSQL";
    public static final String GET_IS_USER_NAME_EXISTING = "IsUserNameExistingSQL";
    public static final String GET_PROPS_FOR_PROFILE = "GetUserPropertiesForProfileSQL";
    public static final String GET_PROPS_FOR_PROFILE_WITH_ID = "GetUserPropertiesForProfileWithIDSQL";
    public static final String GET_USERS_PROPS_FOR_PROFILE = "GetUsersPropertiesForProfileSQL";
    public static final String GET_USERS_PROPS_FOR_PROFILE_WITH_ID = "GetUsersPropertiesForProfileWithIDSQL";
    public static final String GET_PROP_FOR_PROFILE = "GetUserPropertyForProfileSQL";
    public static final String GET_PROP_FOR_PROFILE_WITH_ID = "GetUserPropertyForProfileWithIDSQL";
    public static final String GET_USERS_FOR_PROP = "GetUserLisForPropertySQL";
    public static final String GET_USERS_FOR_PROP_WITH_ESCAPE = "GetUserListForPropertySQLWithEscape";
    public static final String GET_USERS_FOR_CLAIM_VALUE = "GetUserListForClaimValueSQL";
    public static final String GET_USERS_FOR_PROP_WITH_ID = "GetUserLisForPropertyWithIDSQL";
    public static final String GET_USERS_FOR_USERNAME = "GetUserListForUsernameSQL";
    public static final String GET_USER_FOR_USERNAME = "GetUserForUsernameSQL";
    public static final String GET_USERS_FOR_CLAIM_VALUE_WITH_ID = "GetUserListForClaimValueWithIDSQL";
    public static final String GET_PAGINATED_USERS_FOR_PROP = "GetPaginatedUserLisForPropertySQL";
    public static final String GET_PAGINATED_USERS_FOR_PROP_WITH_ID = "GetPaginatedUserLisForPropertyWithIDSQL";
    public static final String GET_PAGINATED_USERS_FOR_PROP_MSSQL = "GetPaginatedUserLisForPropertySQL-mssql";
    public static final String GET_PAGINATED_USERS_FOR_PROP_ORACLE = "GetPaginatedUserLisForPropertySQL-oracle";
    public static final String GET_PAGINATED_USERS_FOR_PROP_DB2 = "GetPaginatedUserLisForPropertySQL-db2";
    public static final String GET_PAGINATED_USERS_COUNT_FOR_PROP = "GetPaginatedUserCountForPropertySQL";
    public static final String GET_PAGINATED_USERS_COUNT_FOR_PROP_WITH_ID = "GetPaginatedUserCountForPropertyWithIDSQL";
    public static final String GET_PROFILE_NAMES = "GetProfileNamesSQL";
    public static final String GET_PROFILE_NAMES_FOR_USER = "GetUserProfileNamesSQL";
    public static final String GET_PROFILE_NAMES_FOR_USER_WITH_ID = "GetUserProfileNamesWithIDSQL";
    public static final String GET_USERID_FROM_USERNAME = "GetUserIDFromUserNameSQL";
    public static final String GET_USERID_FROM_USERNAME_WITH_ID = "GetUserIDFromUserNameWithIDSQL";
    public static final String GET_USERNAME_FROM_TENANT_ID = "GetUserNameFromTenantIDSQL";
    public static final String GET_TENANT_ID_FROM_USERNAME = "GetTenantIDFromUserNameSQL";
    public static final String ADD_SHARED_ROLE = "AddSharedRoleSQL";
    public static final String ADD_USER = "AddUserSQL";
    public static final String ADD_USER_WITH_ID = "AddUserWithIDSQL";
    public static final String ADD_USER_TO_ROLE = "AddUserToRoleSQL";
    public static final String ADD_USER_TO_ROLE_WITH_ID = "AddUserToRoleWithIDSQL";
    public static final String ADD_USER_PERMISSION = "AddUserPermissionSQL";
    public static final String ADD_ROLE = "AddRoleSQL";
    public static final String ADD_ROLE_TO_USER = "AddRoleToUserSQL";
    public static final String ADD_ROLE_TO_USER_WITH_ID = "AddRoleToUserWithIDSQL";
    public static final String ADD_SHARED_ROLE_TO_USER = "AddSharedRoleToUserSQL";
    public static final String ADD_SHARED_ROLE_TO_USER_WITH_ID = "AddSharedRoleToUserWithIDSQL";
    public static final String ADD_ROLE_PERMISSION = "AddRolePermissionSQL";
    public static final String REMOVE_USER_FROM_ROLE = "RemoveUserFromRoleSQL";
    public static final String REMOVE_USER_FROM_ROLE_WITH_ID = "RemoveUserFromRoleWithIDSQL";
    public static final String REMOVE_USER_FROM_SHARED_ROLE = "RemoveUserFromSharedRoleSQL";
    public static final String REMOVE_USER_FROM_SHARED_ROLE_WITH_ID = "RemoveUserFromSharedRoleWithIDSQL";
    public static final String REMOVE_ROLE_FROM_USER = "RemoveRoleFromUserSQL";
    public static final String REMOVE_ROLE_FROM_USER_WITH_ID = "RemoveRoleFromUserWithIDSQL";
    public static final String DELETE_ROLE = "DeleteRoleSQL";
    public static final String ON_DELETE_ROLE_REMOVE_USER_ROLE = "OnDeleteRoleRemoveUserRoleMappingSQL";
    public static final String ON_DELETE_ROLE_DELETE_PERMISSION = "OnDeleteRoleRemovePermissionsSQL";
    public static final String DELETE_USER = "DeleteUserSQL";
    public static final String DELETE_USER_WITH_ID = "DeleteUserWithIDSQL";
    public static final String ON_DELETE_USER_REMOVE_USER_ROLE = "OnDeleteUserRemoveUserRoleMappingSQL";
    public static final String ON_DELETE_USER_REMOVE_USER_ROLE_WITH_ID = "OnDeleteUserRemoveUserRoleMappingWithIDSQL";
    public static final String COUNT_USERS_WITH_CLAIM = "CountUsersWithClaimSQL";
    public static final String COUNT_USERS = "CountUsersSQL";
    public static final String COUNT_ROLES = "CountRolesSQL";
    public static final String COUNT_USERS_WITH_FILTER = "CountUsersWithFilterSQL";
    public static final String COUNT_APPLICATION_ROLES = "CountApplicationRolesSQL";
    public static final String COUNT_INTERNAL_ROLES = "CountInternalRolesSQL";
    public static final String ON_DELETE_USER_REMOVE_ATTRIBUTE = "OnDeleteUserRemoveUserAttributeSQL";
    public static final String ON_DELETE_USER_REMOVE_ATTRIBUTE_WITH_ID = "OnDeleteUserRemoveUserAttributeWithIDSQL";
    public static final String ON_DELETE_USER_DELETE_PERMISSION = "OnDeleteUserRemovePermissionsSQL";
    public static final String IS_DOMAIN_EXISTING = "IsDomainExistingSQL";
    public static final String ADD_DOMAIN = "AddDomainSQL";
    public static final String APPLICATION_DOMAIN = "Application";
    public static final String UPDATE_USER_PASSWORD = "UpdateUserPasswordSQL";
    public static final String UPDATE_USER_PASSWORD_WITH_ID = "UpdateUserPasswordWithIDSQL";
    public static final String UPDATE_ROLE_NAME = "UpdateRoleNameSQL";
    public static final String ADD_USER_PROPERTY = "AddUserPropertySQL";
    public static final String ADD_USER_PROPERTY_WITH_ID = "AddUserPropertyWithIDSQL";
    public static final String UPDATE_USER_PROPERTY = "UpdateUserPropertySQL";
    public static final String UPDATE_USER_PROPERTY_WITH_ID = "UpdateUserPropertyWithIDSQL";
    public static final String UPDATE_USER_PROPERTY_WITH_ID_OPTIMIZED = "UpdateUserPropertyWithIDOptimizedSQL";
    public static final String SELECT_USER_PROPERTIES_WITH_ID = "SelectUserPropertiesWithIDSQL";
    public static final String SELECT_USER_PROPERTIES_WITH_ID_OPTIMIZED = "SelectUserPropertiesWithIDOptimizedSQL";
    public static final String DELETE_USER_PROPERTY = "DeleteUserPropertySQL";
    public static final String DELETE_USER_PROPERTY_WITH_ID = "DeleteUserPropertyWWithIDSQL";
    public static final String USER_NAME_UNIQUE = "UserNameUniqueAcrossTenantsSQL";
    public static final String USER_ID_UNIQUE_WITH_ID = "UserIDUniqueAcrossTenantsSQLWithID";
    public static final String USER_NAME_UNIQUE_WITH_ID = "UserNameUniqueAcrossTenantsSQLWithID";

    // Group Related Properties.
    public static final String GET_GROUP_ID_FROM_GROUP_NAME = "GetGroupIDFromGroupNameSQL";
    public static final String GET_GROUP_NAME_FROM_GROUP_ID = "GetGroupNameFromGroupIDSQL";
    public static final String GET_GROUP_FROM_GROUP_NAME = "GetGroupFromGroupNameSQL";
    public static final String GET_GROUP_FROM_GROUP_ID = "GetGroupFromGroupIDSQL";
    public static final String GET_GROUP_FILTER_WITH_GROUP_NAME = "GetGroupFilterWithGroupNameSQL";
    public static final String GET_GROUP_FILTER_WITH_GROUP_ID = "GetGroupFilterWithGroupIDSQL";
    public static final String GET_GROUP_FILTER_WITH_CREATED_DATE = "GetGroupFilterWithCreatedDateSQL";
    public static final String GET_GROUP_FILTER_WITH_LAST_MODIFIED = "GetGroupFilterWithLastModifiedSQL";
    public static final String ADD_GROUP = "AddGroupSQL";
    public static final String UPDATE_GROUP_NAME = "UpdateGroupNameSQL";
    public static final String UPDATE_GROUP_LAST_MODIFIED = "UpdateGroupLastModifiedTimeSQL";
    public static final String UPDATE_GROUP_LAST_MODIFIED_WITH_GROUP_ID = "UpdateGroupLastModifiedTimeWithGroupIDSQL";
    public static final String COUNT_ROLES_SQL = "SELECT COUNT(UM_ROLE_NAME) AS RESULT FROM UM_ROLE WHERE UM_ROLE_NAME LIKE ? AND " +
            "UM_TENANT_ID = ?";
    public static final String COUNT_USERS_WITH_CLAIM_SQL = "SELECT COUNT(UM_USER_ID) AS RESULT FROM UM_USER_ATTRIBUTE WHERE UM_ATTR_NAME = ? " +
            "AND UM_TENANT_ID = ? AND UM_ATTR_VALUE LIKE ? AND UM_PROFILE_ID = ?";
    public static final String COUNT_USERS_SQL = "SELECT COUNT(UM_USER_NAME) AS RESULT FROM UM_USER WHERE UM_USER_NAME LIKE ? " + "AND UM_TENANT_ID = ?";
    public static final String SELECT_USER_SQL = "SELECT * FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?";
    public static final String COUNT_USERS_WITH_FILTER_SQL = "SELECT COUNT(UM_USER_NAME) AS RESULT FROM UM_USER WHERE UM_USER_NAME = ? " + "AND UM_TENANT_ID = ?";
    public static final String SELECT_USER_NAME_SQL =
            "SELECT UM_USER_ID, UM_USER_NAME, UM_USER_PASSWORD, UM_SALT_VALUE, "
                    + "UM_REQUIRE_CHANGE, UM_CHANGED_TIME FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?";
    public static final String SELECT_USER_ID_SQL = "SELECT UM_USER_ID, UM_USER_NAME, UM_USER_PASSWORD, UM_SALT_VALUE, "
            + "UM_REQUIRE_CHANGE, UM_CHANGED_TIME FROM UM_USER WHERE UM_USER_ID=? AND UM_TENANT_ID=?";
    public static final String SELECT_USER_ID_WITH_ID_SQL = "SELECT UM_USER.UM_REQUIRE_CHANGE, UM_USER"
            + ".UM_CHANGED_TIME FROM UM_USER WHERE UM_USER_ID=? AND UM_TENANT_ID=?";
    public static final String SELECT_USER_WITH_ID_SQL = "SELECT UM_USER.UM_USER_ID, UM_USER.UM_USER_NAME, UM_USER"
            + ".UM_USER_PASSWORD, UM_USER.UM_SALT_VALUE, UM_USER.UM_REQUIRE_CHANGE, UM_USER.UM_CHANGED_TIME FROM "
            + "UM_USER, UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE"
            + ".UM_ATTR_NAME =? AND UM_USER_ATTRIBUTE.UM_ATTR_VALUE =? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? AND "
            + "UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String SELECT_USER_ID_FROM_USER_NAME_SQL = "SELECT UM_USER_ID FROM UM_USER WHERE "
            + "UM_USER_NAME=? AND UM_TENANT_ID=?";
    public static final String SELECT_USER_NAME_FROM_USER_ID_SQL = "SELECT UM_USER_NAME FROM UM_USER WHERE "
            + "UM_USER_ID=? AND UM_TENANT_ID=?";
    public static final String GET_ROLE_LIST_SQL = "SELECT UM_ROLE_NAME, UM_TENANT_ID, UM_SHARED_ROLE FROM UM_ROLE WHERE UM_ROLE_NAME LIKE ? AND UM_TENANT_ID=? AND UM_SHARED_ROLE ='0' ORDER BY UM_ROLE_NAME";
    public static final String GET_ROLE_LIST_SQL_H2 = "SELECT UM_ROLE_NAME, UM_TENANT_ID, UM_SHARED_ROLE FROM UM_ROLE WHERE UM_ROLE_NAME LIKE ? AND UM_TENANT_ID=? AND UM_SHARED_ROLE =FALSE ORDER BY UM_ROLE_NAME";
    public static final String GET_ROLE_LIST_SQL_WITH_ESCAPE = "SELECT UM_ROLE_NAME, UM_TENANT_ID, UM_SHARED_ROLE " +
            "FROM UM_ROLE WHERE UM_ROLE_NAME LIKE ? ESCAPE ? AND UM_TENANT_ID=? AND UM_SHARED_ROLE ='0' ORDER BY " +
            "UM_ROLE_NAME";
    public static final String GET_ROLE_LIST_SQL_WITH_ESCAPE_H2 = "SELECT UM_ROLE_NAME, UM_TENANT_ID, UM_SHARED_ROLE " +
            "FROM UM_ROLE WHERE UM_ROLE_NAME LIKE ? ESCAPE ? AND UM_TENANT_ID=? AND UM_SHARED_ROLE =FALSE ORDER BY " +
            "UM_ROLE_NAME";
    public static final String GET_SHARED_ROLE_LIST_SQL = "SELECT UM_ROLE_NAME, UM_TENANT_ID, UM_SHARED_ROLE FROM UM_ROLE WHERE UM_ROLE_NAME LIKE ? AND UM_SHARED_ROLE ='1' ORDER BY UM_ROLE_NAME";
    public static final String GET_SHARED_ROLE_LIST_SQL_H2 = "SELECT UM_ROLE_NAME, UM_TENANT_ID, UM_SHARED_ROLE FROM UM_ROLE WHERE UM_ROLE_NAME LIKE ? AND UM_SHARED_ROLE =TRUE ORDER BY UM_ROLE_NAME";
    public static final String GET_USER_FILTER_SQL = "SELECT UM_USER_NAME FROM UM_USER WHERE UM_USER_NAME LIKE ? AND UM_TENANT_ID=? ORDER BY UM_USER_NAME";
    public static final String GET_USER_FILTER_WITH_ID_SQL = "SELECT UM_USER_ID, UM_USER_NAME FROM UM_USER WHERE "
            + "UM_USER_NAME LIKE ? AND UM_TENANT_ID=? ORDER BY UM_USER_NAME";
    public static final String GET_USER_FILTER_WITH_ID_WITH_ESCAPE_SQL = "SELECT UM_USER_ID, UM_USER_NAME FROM UM_USER WHERE "
            + "UM_USER_NAME LIKE ? ESCAPE ? AND UM_TENANT_ID=? ORDER BY UM_USER_NAME";
    public static final String GET_USER_FILTER_SQL_WITH_ESCAPE = "SELECT UM_USER_NAME FROM UM_USER WHERE UM_USER_NAME "
            + "LIKE ? ESCAPE ? AND UM_TENANT_ID=? ORDER BY UM_USER_NAME";
    public static final String GET_USER_FILTER_PAGINATED_SQL = "SELECT UM_USER_NAME FROM UM_USER WHERE UM_USER_NAME " +
            "LIKE ? AND UM_TENANT_ID=? ORDER BY UM_USER_NAME ASC LIMIT ? OFFSET ?";
    public static final String GET_USER_FILTER_PAGINATED_WITH_ID_SQL = "SELECT UM_USER_ID, UM_USER_NAME FROM UM_USER "
            + "WHERE UM_USER_NAME LIKE ? AND UM_TENANT_ID=? ORDER BY UM_USER_NAME ASC LIMIT ? OFFSET ?";
    public static final String GET_USER_FILTER_PAGINATED_SQL_DB2 = "SELECT UM_USER_NAME FROM (SELECT ROW_NUMBER() " +
            "OVER (ORDER BY UM_USER_NAME) AS rn, U.*  FROM UM_USER AS U) WHERE UM_USER_NAME LIKE ? AND UM_TENANT_ID " +
            "= ? AND rn BETWEEN ? AND ?";
    public static final String GET_USER_FILTER_PAGINATED_WITH_ID_SQL_DB2 =
            "SELECT UM_USER.UM_USER_ID, UM_USER_ATTRIBUTE.UM_ATTR_VALUE FROM (SELECT "
                    + "ROW_NUMBER() OVER (ORDER BY UM_USER.UM_USER_ID) AS rn, UM_USER.UM_USER_ID FROM UM_USER, "
                    + "UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME =? AND "
                    + "UM_USER_ATTRIBUTE.UM_ATTR_VALUE LIKE ? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? AND "
                    + "UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER"
                    + ".UM_TENANT_ID=? ) WHERE rn BETWEEN ? AND ?";
    public static final String GET_USER_FILTER_PAGINATED_SQL_MSSQL = "SELECT UM_USER_NAME FROM (SELECT UM_USER_NAME," +
            "UM_TENANT_ID, ROW_NUMBER() OVER (ORDER BY UM_USER_NAME) AS RowNum FROM UM_USER) AS P WHERE P" +
            ".UM_USER_NAME LIKE ? AND P.UM_TENANT_ID= ? AND P.RowNum BETWEEN ? AND ?";
    public static final String GET_USER_FILTER_PAGINATED_WITH_ID_SQL_MSSQL = "SELECT UM_USER.UM_USER_ID, "
            + "UM_USER_ATTRIBUTE.UM_ATTR_VALUE FROM (SELECT UM_USER.UM_USER_ID,ROW_NUMBER() OVER (ORDER BY "
            + "UM_USER.UM_USER_ID) AS RowNum FROM UM_USER, UM_USER_ATTRIBUTE WHERE "
            + "UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME=? AND UM_USER_ATTRIBUTE"
            + ".UM_ATTR_VALUE LIKE ? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND "
            + "UM_USER.UM_TENANT_ID=?) AS P WHERE P.RowNum BETWEEN ? AND ?";
    public static final String GET_USER_FILTER_PAGINATED_SQL_ORACLE = "SELECT UM_USER_NAME FROM (SELECT UM_USER_NAME," +
            " UM_TENANT_ID, rownum AS rnum FROM (SELECT UM_USER_NAME, UM_TENANT_ID FROM UM_USER ORDER BY " +
            "UM_USER_NAME) WHERE UM_USER_NAME LIKE ? AND UM_TENANT_ID=? AND rownum <= ?) WHERE  rnum > ?";
    public static final String GET_USER_FILTER_PAGINATED_WITH_ID_SQL_ORACLE =
            "SELECT UM_USER.UM_USER_ID, UM_USER_ATTRIBUTE.UM_ATTR_VALUE FROM (SELECT UM_USER.UM_USER_ID, rownum AS "
                    + "rnum FROM (SELECT DISTINCT UM_USER.UM_USER_ID FROM UM_USER, UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE"
                    + ".UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME =? AND "
                    + "UM_USER_ATTRIBUTE.UM_ATTR_VALUE LIKE ? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? AND "
                    + "UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=? ORDER BY "
                    + "UM_USER.UM_USER_ID ) WHERE rownum <= ?) WHERE  rnum > ?";
    public static final String GET_USER_FILTER_PAGINATED_COUNT_SQL = "SELECT COUNT(UM_USER_NAME) FROM UM_USER WHERE " +
            "UM_USER_NAME LIKE ? AND UM_TENANT_ID=?";
    public static final String GET_USER_FILTER_PAGINATED_COUNT_WITH_ID_SQL = "SELECT COUNT(UM_USER_ID) FROM UM_USER "
            + "WHERE UM_USER_NAME LIKE ? AND UM_TENANT_ID=?";
    public static final String GET_USER_ROLE_SQL = "SELECT UM_ROLE_NAME FROM UM_USER_ROLE, UM_ROLE, UM_USER WHERE UM_USER.UM_USER_NAME=? AND UM_USER.UM_ID=UM_USER_ROLE.UM_USER_ID AND UM_ROLE.UM_ID=UM_USER_ROLE.UM_ROLE_ID AND UM_USER_ROLE.UM_TENANT_ID=? AND UM_ROLE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USER_ROLE_WITH_ID_SQL = "SELECT UM_ROLE_NAME FROM UM_USER_ROLE, UM_ROLE, UM_USER "
            + "WHERE UM_USER.UM_USER_ID=? AND UM_USER.UM_ID=UM_USER_ROLE.UM_USER_ID AND UM_ROLE.UM_ID=UM_USER_ROLE"
            + ".UM_ROLE_ID AND UM_USER_ROLE.UM_TENANT_ID=? AND UM_ROLE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_IS_USER_ROLE_EXIST_SQL = "SELECT UM_ROLE_NAME FROM UM_USER_ROLE, UM_ROLE, UM_USER "
            + "WHERE UM_USER.UM_USER_NAME=? AND UM_USER.UM_ID=UM_USER_ROLE.UM_USER_ID AND UM_ROLE.UM_ID=UM_USER_ROLE.UM_ROLE_ID "
            + "AND UM_USER_ROLE.UM_TENANT_ID=? AND UM_ROLE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=? AND UM_ROLE_NAME LIKE ?";
    public static final String GET_IS_USER_ROLE_EXIST_WITH_ID_SQL = "SELECT UM_ROLE_NAME FROM UM_USER_ROLE, UM_ROLE, "
            + "UM_USER WHERE UM_USER.UM_USER_ID=? AND UM_USER.UM_ID=UM_USER_ROLE.UM_USER_ID AND UM_ROLE"
            + ".UM_ID=UM_USER_ROLE.UM_ROLE_ID AND UM_USER_ROLE.UM_TENANT_ID=? AND UM_ROLE.UM_TENANT_ID=? AND UM_USER"
            + ".UM_TENANT_ID=? AND UM_ROLE_NAME LIKE ?";
    public static final String GET_USERS_ROLE_SQL = "SELECT UM_USER_NAME,UM_ROLE_NAME FROM UM_USER_ROLE, UM_ROLE, " +
            "UM_USER WHERE UM_USER.UM_USER_NAME IN (?) AND UM_USER.UM_ID=UM_USER_ROLE.UM_USER_ID AND UM_ROLE" +
            ".UM_ID=UM_USER_ROLE.UM_ROLE_ID AND UM_USER_ROLE.UM_TENANT_ID=? AND UM_ROLE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USERS_ROLE_WITH_ID_SQL = "SELECT UM_USER.UM_USER_ID,UM_ROLE_NAME FROM UM_USER_ROLE, "
            + "UM_ROLE, UM_USER WHERE UM_USER.UM_USER_ID IN (?) AND UM_USER.UM_ID=UM_USER_ROLE.UM_USER_ID AND "
            + "UM_ROLE.UM_ID=UM_USER_ROLE.UM_ROLE_ID AND UM_USER_ROLE.UM_TENANT_ID=? AND UM_ROLE.UM_TENANT_ID=? AND "
            + "UM_USER.UM_TENANT_ID=?";
    public static final String GET_SHARED_ROLES_FOR_USER_SQL =
            "SELECT UM_ROLE_NAME, UM_ROLE.UM_TENANT_ID, UM_SHARED_ROLE FROM UM_SHARED_USER_ROLE INNER JOIN UM_USER ON "
                    + "UM_SHARED_USER_ROLE.UM_USER_ID = UM_USER.UM_ID INNER JOIN UM_ROLE ON "
                    + "UM_SHARED_USER_ROLE.UM_ROLE_ID = UM_ROLE.UM_ID WHERE UM_USER.UM_USER_NAME = ? "
                    + "AND UM_SHARED_USER_ROLE.UM_USER_TENANT_ID = UM_USER.UM_TENANT_ID AND "
                    + "UM_SHARED_USER_ROLE.UM_ROLE_TENANT_ID = UM_ROLE.UM_TENANT_ID AND UM_SHARED_USER_ROLE.UM_USER_TENANT_ID = ? ";
    public static final String GET_SHARED_ROLES_FOR_USER_WITH_ID_SQL =
            "SELECT UM_ROLE_NAME, UM_ROLE.UM_TENANT_ID, UM_SHARED_ROLE FROM UM_SHARED_USER_ROLE INNER JOIN UM_USER ON "
                    + "UM_SHARED_USER_ROLE.UM_USER_ID = UM_USER.UM_ID INNER JOIN UM_ROLE ON "
                    + "UM_SHARED_USER_ROLE.UM_ROLE_ID = UM_ROLE.UM_ID WHERE UM_USER.UM_USER_ID = ? "
                    + "AND UM_SHARED_USER_ROLE.UM_USER_TENANT_ID = UM_USER.UM_TENANT_ID AND "
                    + "UM_SHARED_USER_ROLE.UM_ROLE_TENANT_ID = UM_ROLE.UM_TENANT_ID AND UM_SHARED_USER_ROLE.UM_USER_TENANT_ID = ? ";
    public static final String GET_IS_ROLE_EXISTING_SQL = "SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?";
    public static final String GET_USERS_IN_ROLE_SQL = "SELECT UM_USER_NAME FROM UM_USER_ROLE, UM_ROLE, " +
            "UM_USER WHERE UM_ROLE.UM_ROLE_NAME=? AND UM_USER.UM_ID=UM_USER_ROLE.UM_USER_ID AND UM_ROLE.UM_ID=UM_USER_ROLE.UM_ROLE_ID AND UM_USER_ROLE.UM_TENANT_ID=? AND UM_ROLE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USERS_IN_ROLE_FILTER_SQL = "SELECT UM_USER_NAME FROM UM_USER_ROLE, UM_ROLE, " +
            "UM_USER WHERE UM_USER.UM_USER_NAME LIKE ? AND UM_ROLE.UM_ROLE_NAME=? AND UM_USER.UM_ID=UM_USER_ROLE.UM_USER_ID AND " +
            "UM_ROLE.UM_ID=UM_USER_ROLE.UM_ROLE_ID AND UM_USER_ROLE.UM_TENANT_ID=? AND UM_ROLE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USERS_IN_ROLE_FILTER_WITH_ID_SQL =
            "SELECT UM_USER.UM_USER_ID, UM_USER.UM_USER_NAME FROM UM_USER_ROLE, UM_ROLE, UM_USER WHERE UM_USER"
                    + ".UM_USER_NAME LIKE ? AND UM_ROLE.UM_ROLE_NAME=? AND UM_USER.UM_ID=UM_USER_ROLE.UM_USER_ID AND "
                    + "UM_ROLE.UM_ID=UM_USER_ROLE.UM_ROLE_ID AND UM_USER_ROLE.UM_TENANT_ID=? AND UM_ROLE"
                    + ".UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";

    public static final String GET_USERS_COUNT_WITH_FILTER_ROLE_SQL = "SELECT COUNT(UM_USER_NAME) FROM " +
            "UM_USER_ROLE, UM_ROLE, UM_USER WHERE UM_ROLE.UM_ROLE_NAME=? AND UM_USER.UM_ID=UM_USER_ROLE.UM_USER_ID " +
            "AND UM_ROLE.UM_ID=UM_USER_ROLE.UM_ROLE_ID AND UM_USER_ROLE.UM_TENANT_ID=? AND UM_ROLE.UM_TENANT_ID=? " +
            "AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USERS_COUNT_WITH_FILTER_ROLE_SQL_WITH_ID = "SELECT COUNT(UM_ID) FROM UM_USER_ROLE " +
            "WHERE UM_ROLE_ID = ? AND UM_TENANT_ID = ?";

    public static final String GET_ROLE_ID_BY_NAME_SQL =  "SELECT UM_ID FROM UM_ROLE " +
            "WHERE UM_ROLE_NAME = ? AND UM_TENANT_ID = ? ";

    public static final String GET_USERS_IN_SHARED_ROLE_SQL =
            "SELECT UM_USER_NAME FROM UM_SHARED_USER_ROLE INNER JOIN UM_USER ON "
                    + "UM_SHARED_USER_ROLE.UM_USER_ID = UM_USER.UM_ID INNER JOIN UM_ROLE ON "
                    + "UM_SHARED_USER_ROLE.UM_ROLE_ID = UM_ROLE.UM_ID WHERE UM_ROLE.UM_ROLE_NAME= ? "
                    + "AND UM_SHARED_USER_ROLE.UM_USER_TENANT_ID = UM_USER.UM_TENANT_ID AND "
                    + "UM_SHARED_USER_ROLE.UM_ROLE_TENANT_ID = UM_ROLE.UM_TENANT_ID";
    public static final String GET_USERS_IN_SHARED_ROLE_FILTER_SQL =
            "SELECT UM_USER_NAME FROM UM_SHARED_USER_ROLE INNER JOIN UM_USER ON "
                    + "UM_SHARED_USER_ROLE.UM_USER_ID = UM_USER.UM_ID INNER JOIN UM_ROLE ON "
                    + "UM_SHARED_USER_ROLE.UM_ROLE_ID = UM_ROLE.UM_ID WHERE UM_USER.UM_USER_NAME LIKE ? "
                    + "AND UM_ROLE.UM_ROLE_NAME= ? "
                    + "AND UM_SHARED_USER_ROLE.UM_USER_TENANT_ID = UM_USER.UM_TENANT_ID AND "
                    + "UM_SHARED_USER_ROLE.UM_ROLE_TENANT_ID = UM_ROLE.UM_TENANT_ID";
    public static final String GET_USERS_IN_SHARED_ROLE_FILTER_WITH_ID_SQL =
            "SELECT UM_USER.UM_USER_ID, UM_USER.UM_USER_NAME FROM UM_SHARED_USER_ROLE INNER JOIN UM_USER ON "
                    + "UM_SHARED_USER_ROLE.UM_USER_ID = UM_USER.UM_ID INNER JOIN UM_ROLE ON "
                    + "UM_SHARED_USER_ROLE.UM_ROLE_ID = UM_ROLE.UM_ID WHERE UM_USER.UM_USER_NAME LIKE ? "
                    + "AND UM_ROLE.UM_ROLE_NAME= ? AND UM_SHARED_USER_ROLE.UM_USER_TENANT_ID = UM_USER.UM_TENANT_ID "
                    + "AND UM_SHARED_USER_ROLE.UM_ROLE_TENANT_ID = UM_ROLE.UM_TENANT_ID";
    public static final String GET_IS_USER_EXISTING_SQL = "SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?";
    public static final String GET_IS_USER_EXISTING_WITH_ID_SQL = "SELECT UM_ID FROM UM_USER WHERE UM_USER_ID=? AND "
            + "UM_TENANT_ID=?";
    public static final String GET_IS_USER_NAME_EXISTING_SQL = "SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND "
            + "UM_TENANT_ID=?";
    public static final String GET_PROPS_FOR_PROFILE_SQL = "SELECT UM_ATTR_NAME, UM_ATTR_VALUE FROM UM_USER_ATTRIBUTE, UM_USER WHERE UM_USER.UM_ID = UM_USER_ATTRIBUTE.UM_USER_ID AND UM_USER.UM_USER_NAME=? AND UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_PROPS_FOR_PROFILE_WITH_ID_SQL = "SELECT UM_ATTR_NAME, UM_ATTR_VALUE FROM "
            + "UM_USER_ATTRIBUTE, UM_USER WHERE UM_USER.UM_ID = UM_USER_ATTRIBUTE.UM_USER_ID AND UM_USER.UM_USER_ID=?"
            + " AND UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USERS_PROPS_FOR_PROFILE_SQL = "SELECT UM_USER_NAME,UM_ATTR_NAME, UM_ATTR_VALUE " +
            "FROM UM_USER_ATTRIBUTE, UM_USER WHERE UM_USER.UM_ID = UM_USER_ATTRIBUTE.UM_USER_ID AND UM_USER" +
            ".UM_USER_NAME IN (?) AND UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USERS_PROPS_FOR_PROFILE_WITH_ID_SQL = "SELECT UM_USER.UM_USER_ID, UM_ATTR_NAME, "
            + "UM_ATTR_VALUE FROM UM_USER_ATTRIBUTE, UM_USER WHERE UM_USER.UM_ID = UM_USER_ATTRIBUTE.UM_USER_ID AND "
            + "UM_USER.UM_USER_ID IN (?) AND UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER"
            + ".UM_TENANT_ID=?";
    public static final String GET_PROP_FOR_PROFILE_SQL = "SELECT UM_ATTR_VALUE FROM UM_USER_ATTRIBUTE, UM_USER WHERE UM_USER.UM_ID = UM_USER_ATTRIBUTE.UM_USER_ID AND UM_USER.UM_USER_NAME=? AND UM_ATTR_NAME=? AND UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_PROP_FOR_PROFILE_WITH_ID_SQL = "SELECT UM_ATTR_VALUE FROM UM_USER_ATTRIBUTE, "
            + "UM_USER WHERE UM_USER.UM_ID = UM_USER_ATTRIBUTE.UM_USER_ID AND UM_USER.UM_USER_ID=? AND UM_ATTR_NAME=?"
            + " AND UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USERS_FOR_PROP_SQL = "SELECT DISTINCT UM_USER_NAME FROM UM_USER, UM_USER_ATTRIBUTE " +
            "WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME =? " +
            "AND UM_USER_ATTRIBUTE.UM_ATTR_VALUE LIKE ? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? " +
            "AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USERS_FOR_PROP_SQL_WITH_ESCAPE = "SELECT DISTINCT UM_USER_NAME FROM UM_USER, " +
            "UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME =? " +
            "AND UM_USER_ATTRIBUTE.UM_ATTR_VALUE LIKE ? ESCAPE ? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? " +
            "AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USERS_FOR_CLAIM_VALUE_SQL = "SELECT DISTINCT UM_USER_NAME FROM UM_USER, " +
            "UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME =? " +
            "AND UM_USER_ATTRIBUTE.UM_ATTR_VALUE =? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? " +
            "AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USERS_FOR_PROP_WITH_ID_SQL = "SELECT DISTINCT UM_USER.UM_USER_ID FROM UM_USER, "
            + "UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME =? " +
            "AND UM_USER_ATTRIBUTE.UM_ATTR_VALUE LIKE ? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? " +
            "AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USERS_FOR_USERNAME_SQL = "SELECT DISTINCT UM_USER.UM_USER_ID " +
            "FROM UM_USER WHERE UM_USER.UM_USER_NAME LIKE ? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USER_FOR_USERNAME_SQL = "SELECT DISTINCT UM_USER.UM_USER_ID " +
            "FROM UM_USER WHERE UM_USER.UM_USER_NAME=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_USERS_FOR_CLAIM_VALUE_WITH_ID_SQL = "SELECT DISTINCT UM_USER.UM_USER_ID FROM " +
            "UM_USER, UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND " +
            "UM_USER_ATTRIBUTE.UM_ATTR_NAME =? AND UM_USER_ATTRIBUTE.UM_ATTR_VALUE =? AND " +
            "UM_USER_ATTRIBUTE.UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_PAGINATED_USERS_FOR_PROP_SQL = "SELECT UM_USER_NAME FROM UM_USER, " +
            "UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME " +
            "=? AND UM_USER_ATTRIBUTE.UM_ATTR_VALUE LIKE ? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=? ORDER BY UM_USER_NAME ASC LIMIT ? OFFSET ?";
    public static final String GET_PAGINATED_USERS_FOR_PROP_WITH_ID_SQL = "SELECT UM_USER.UM_USER_ID, UM_USER"
            + ".UM_USER_NAME FROM UM_USER, UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND "
            + "UM_USER_ATTRIBUTE.UM_ATTR_NAME =? AND UM_USER_ATTRIBUTE.UM_ATTR_VALUE LIKE ? AND UM_USER_ATTRIBUTE"
            + ".UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=? ORDER BY UM_USER_NAME"
            + " ASC LIMIT ? OFFSET ?";
    public static final String GET_PAGINATED_USERS_FOR_PROP_SQL_ORACLE = "SELECT UM_USER_NAME FROM (SELECT " +
            "UM_USER_NAME, rownum AS rnum FROM (SELECT DISTINCT UM_USER_NAME FROM UM_USER, UM_USER_ATTRIBUTE WHERE " +
            "UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME =? AND " +
            "UM_USER_ATTRIBUTE.UM_ATTR_VALUE LIKE ? AND UM_USER_ATTRIBUTE" +
            ".UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=? ORDER BY UM_USER_NAME )" +
            "WHERE rownum <= ?) WHERE  rnum > ?";
    public static final String GET_PAGINATED_USERS_FOR_PROP_WITH_ID_SQL_ORACLE = "SELECT UM_USER.UM_USER_ID FROM (SELECT " +
            "UM_USER.UM_USER_ID, rownum AS rnum FROM (SELECT DISTINCT UM_USER.UM_USER_ID FROM UM_USER, UM_USER_ATTRIBUTE "
            + "WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME =? AND " +
            "UM_USER_ATTRIBUTE.UM_ATTR_VALUE LIKE ? AND UM_USER_ATTRIBUTE" +
            ".UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=? ORDER BY UM_USER"
            + ".UM_USER_ID) WHERE rownum <= ?) WHERE  rnum > ?";
    public static final String GET_PAGINATED_USERS_FOR_PROP_SQL_MSSQL = "SELECT UM_USER_NAME FROM (SELECT " +
            "UM_USER_NAME,ROW_NUMBER() OVER (ORDER BY UM_USER_NAME) AS RowNum FROM UM_USER,UM_USER_ATTRIBUTE WHERE " +
            "UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME=? AND UM_USER_ATTRIBUTE" +
            ".UM_ATTR_VALUE LIKE ? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND " +
            "UM_USER.UM_TENANT_ID=?) AS P WHERE P.RowNum BETWEEN ? AND ?";
    public static final String GET_PAGINATED_USERS_FOR_PROP_WITH_ID_SQL_MSSQL = "SELECT UM_USER.UM_USER_ID FROM (SELECT " +
            "UM_USER.UM_USER_ID,ROW_NUMBER() OVER (ORDER BY UM_USER.UM_USER_ID) AS RowNum FROM UM_USER, "
            + "UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME=? AND UM_USER_ATTRIBUTE" +
            ".UM_ATTR_VALUE LIKE ? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND " +
            "UM_USER.UM_TENANT_ID=?) AS P WHERE P.RowNum BETWEEN ? AND ?";
    public static final String GET_PAGINATED_USERS_FOR_PROP_SQL_DB2 = "SELECT UM_USER_NAME FROM (SELECT ROW_NUMBER() " +
            "OVER (ORDER BY UM_USER_NAME) AS rn, UM_USER_NAME FROM UM_USER, UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE" +
            ".UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME =? AND UM_USER_ATTRIBUTE.UM_ATTR_VALUE " +
            "LIKE ? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER" +
            ".UM_TENANT_ID=? ) WHERE rn BETWEEN ? AND ?";
    public static final String GET_PAGINATED_USERS_FOR_PROP_WITH_ID_SQL_DB2 = "SELECT UM_USER.UM_USER_ID FROM (SELECT "
            + "ROW_NUMBER() OVER (ORDER BY UM_USER.UM_USER_ID) AS rn, UM_USER.UM_USER_ID FROM UM_USER, "
            + "UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE"
            + ".UM_ATTR_NAME =? AND UM_USER_ATTRIBUTE.UM_ATTR_VALUE "
            + "LIKE ? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER"
            + ".UM_TENANT_ID=? ) WHERE rn BETWEEN ? AND ?";

    public static final String GET_PAGINATED_USERS_COUNT_FOR_PROP_SQL = "SELECT COUNT (UM_USER_NAME) FROM UM_USER, " +
            "UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME " +
            "=? AND UM_USER_ATTRIBUTE.UM_ATTR_VALUE LIKE ? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_PAGINATED_USERS_COUNT_FOR_PROP_WITH_ID_SQL = "SELECT COUNT (UM_USER.UM_USER_ID) "
            + "FROM UM_USER, UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE.UM_USER_ID = UM_USER.UM_ID AND UM_USER_ATTRIBUTE.UM_ATTR_NAME " +
            "=? AND UM_USER_ATTRIBUTE.UM_ATTR_VALUE LIKE ? AND UM_USER_ATTRIBUTE.UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER.UM_TENANT_ID=?";
    public static final String GET_PROFILE_NAMES_SQL = "SELECT DISTINCT UM_PROFILE_ID FROM UM_USER_ATTRIBUTE WHERE UM_TENANT_ID=?";
    public static final String GET_PROFILE_NAMES_FOR_USER_SQL = "SELECT DISTINCT UM_PROFILE_ID FROM UM_USER_ATTRIBUTE WHERE UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String GET_PROFILE_NAMES_FOR_USER_WITH_ID_SQL = "SELECT DISTINCT UM_PROFILE_ID FROM "
            + "UM_USER_ATTRIBUTE WHERE UM_USER_ATTRIBUTE.UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_ID=? AND"
            + " UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String GET_USERID_FROM_USERNAME_SQL = "SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?";
    public static final String GET_USERID_FROM_USERNAME_WITH_ID_SQL = "SELECT UM_ID FROM UM_USER WHERE UM_USER_ID=? "
            + "AND UM_TENANT_ID=?";
    public static final String GET_USERNAME_FROM_TENANT_ID_SQL = "SELECT UM_USER_NAME FROM UM_USER WHERE UM_TENANT_ID=?";
    public static final String GET_TENANT_ID_FROM_USERNAME_SQL = "SELECT UM_TENANT_ID FROM UM_USER WHERE UM_USER_NAME=?";
    public static final String ADD_USER_SQL = "INSERT INTO UM_USER (UM_USER_NAME, UM_USER_PASSWORD, UM_SALT_VALUE, UM_REQUIRE_CHANGE, UM_CHANGED_TIME, UM_TENANT_ID) VALUES (?, ?, ?, ?, ?, ?)";
    public static final String ADD_USER_WITH_ID_SQL =
            "INSERT INTO UM_USER (UM_USER_ID, UM_USER_NAME, UM_USER_PASSWORD, UM_SALT_VALUE, UM_REQUIRE_CHANGE, "
                    + "UM_CHANGED_TIME, UM_TENANT_ID) VALUES (?, ?, ?, ?, ?, ?, ?)";
    public static final String ADD_USER_TO_ROLE_SQL = "INSERT INTO UM_USER_ROLE (UM_USER_ID, UM_ROLE_ID, UM_TENANT_ID) VALUES ((SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?),(SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?), ?)";
    public static final String ADD_USER_TO_ROLE_WITH_ID_SQL = "INSERT INTO UM_USER_ROLE (UM_USER_ID, UM_ROLE_ID, "
            + "UM_TENANT_ID) VALUES ((SELECT UM_ID FROM UM_USER WHERE UM_USER_ID=? AND UM_TENANT_ID=?),(SELECT UM_ID "
            + "FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?), ?)";
    public static final String ADD_USER_PERMISSION_SQL = "AddUserPermission";
    public static final String ADD_ROLE_SQL = "INSERT INTO UM_ROLE (UM_ROLE_NAME, UM_TENANT_ID) VALUES (?, ?)";
    public static final String ADD_SHARED_ROLE_SQL = "UPDATE UM_ROLE SET UM_SHARED_ROLE = ? WHERE UM_ROLE_NAME = ? AND UM_TENANT_ID = ?";
    public static final String ADD_ROLE_TO_USER_SQL = "INSERT INTO UM_USER_ROLE (UM_ROLE_ID, UM_USER_ID, UM_TENANT_ID) VALUES ((SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?),(SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?), ?)";
    public static final String ADD_ROLE_TO_USER_WITH_ID_SQL = "INSERT INTO UM_USER_ROLE (UM_ROLE_ID, UM_USER_ID, "
            + "UM_TENANT_ID) VALUES ((SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?),(SELECT "
            + "UM_ID FROM UM_USER WHERE UM_USER_ID=? AND UM_TENANT_ID=?), ?)";
    public static final String ADD_SHARED_ROLE_TO_USER_SQL =
            "INSERT INTO UM_SHARED_USER_ROLE (UM_ROLE_ID, UM_USER_ID, UM_USER_TENANT_ID, UM_ROLE_TENANT_ID) "
                    + "VALUES ((SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?),"
                    + "(SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?), ?, ?)";
    public static final String ADD_SHARED_ROLE_TO_USER_WITH_ID_SQL =
            "INSERT INTO UM_SHARED_USER_ROLE (UM_ROLE_ID, UM_USER_ID, UM_USER_TENANT_ID, UM_ROLE_TENANT_ID) "
                    + "VALUES ((SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?),"
                    + "(SELECT UM_ID FROM UM_USER WHERE UM_USER_ID=? AND UM_TENANT_ID=?), ?, ?)";
    public static final String ADD_ROLE_PERMISSION_SQL = "AddRolePermissionSQL";
    public static final String REMOVE_USER_FROM_SHARED_ROLE_SQL =
            "DELETE FROM UM_SHARED_USER_ROLE WHERE UM_ROLE_ID=(SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?) "
                    + "AND UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?) "
                    + "AND UM_USER_TENANT_ID=? AND UM_ROLE_TENANT_ID = ?";
    public static final String REMOVE_USER_FROM_SHARED_ROLE_WITH_ID_SQL = "DELETE FROM UM_SHARED_USER_ROLE WHERE "
            + "UM_ROLE_ID=(SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?) AND UM_USER_ID=(SELECT "
            + "UM_ID FROM UM_USER WHERE UM_USER_ID=? AND UM_TENANT_ID=?) AND UM_USER_TENANT_ID=? AND "
            + "UM_ROLE_TENANT_ID = ?";
    public static final String REMOVE_USER_FROM_ROLE_SQL = "DELETE FROM UM_USER_ROLE WHERE UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?) AND UM_ROLE_ID=(SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String REMOVE_USER_ROLES_BY_TENANT_ID_SQL = "DELETE FROM UM_USER_ROLE " +
            "WHERE UM_TENANT_ID=?";
    public static final String REMOVE_USER_FROM_ROLE_WITH_ID_SQL = "DELETE FROM UM_USER_ROLE WHERE UM_USER_ID=(SELECT "
            + "UM_ID FROM UM_USER WHERE UM_USER_ID=? AND UM_TENANT_ID=?) AND UM_ROLE_ID=(SELECT UM_ID FROM UM_ROLE "
            + "WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String REMOVE_ROLE_FROM_USER_SQL = "DELETE FROM UM_USER_ROLE WHERE UM_ROLE_ID=(SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?) AND UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String REMOVE_ROLE_FROM_USER_WITH_ID_SQL = "DELETE FROM UM_USER_ROLE WHERE UM_ROLE_ID=(SELECT"
            + " UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?) AND UM_USER_ID=(SELECT UM_ID FROM UM_USER"
            + " WHERE UM_USER_ID=? AND UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String DELETE_ROLE_SQL = "DELETE FROM UM_ROLE WHERE UM_ROLE_NAME = ? AND UM_TENANT_ID=?";
    public static final String DELETE_ROLES_BY_TENANT_ID_SQL = "DELETE FROM UM_ROLE WHERE UM_TENANT_ID=?";
    public static final String ON_DELETE_ROLE_REMOVE_USER_ROLE_SQL = "DELETE FROM UM_USER_ROLE WHERE UM_ROLE_ID=(SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String ON_DELETE_ROLE_DELETE_PERMISSION_SQL = "OnDeleteRoleRemovePermissionsSQL";
    public static final String COUNT_APPLICATION_ROLES_SQL = "SELECT COUNT(UM_ID) AS RESULT FROM UM_HYBRID_ROLE WHERE UM_ROLE_NAME " +
            "LIKE ? AND " +"UM_TENANT_ID = ?";
    public static final String DELETE_USER_SQL = "DELETE FROM UM_USER WHERE UM_USER_NAME = ? AND UM_TENANT_ID=?";
    public static final String DELETE_USER_WITH_ID_SQL = "DELETE FROM UM_USER WHERE UM_USER_ID = ? AND UM_TENANT_ID=?";
    public static final String DELETE_USERS_BY_TENANT_ID_SQL = "DELETE FROM UM_USER WHERE UM_TENANT_ID=?";
    public static final String ON_DELETE_USER_REMOVE_USER_ROLE_SQL = "DELETE FROM UM_USER_ROLE WHERE UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String ON_DELETE_USER_REMOVE_USER_ROLE_WITH_ID_SQL = "DELETE FROM UM_USER_ROLE WHERE "
            + "UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_ID=? AND UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String ON_DELETE_USER_REMOVE_ATTRIBUTE_SQL = "DELETE FROM UM_USER_ATTRIBUTE WHERE UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String ON_DELETE_USER_REMOVE_ATTRIBUTE_WITH_ID_SQL = "DELETE FROM UM_USER_ATTRIBUTE WHERE "
            + "UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_ID=? AND UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String ON_DELETE_USER_DELETE_PERMISSION_SQL = "OnDeleteUserRemovePermissionsSQL";
    public static final String UPDATE_USER_PASSWORD_SQL = "UPDATE UM_USER SET UM_USER_PASSWORD= ?, UM_SALT_VALUE=?, UM_REQUIRE_CHANGE=?, UM_CHANGED_TIME=? WHERE UM_USER_NAME= ? AND UM_TENANT_ID=?";
    public static final String UPDATE_USER_PASSWORD_WITH_ID_SQL = "UPDATE UM_USER SET UM_USER_PASSWORD= ?, "
            + "UM_SALT_VALUE=?, UM_REQUIRE_CHANGE=?, UM_CHANGED_TIME=? WHERE UM_USER_ID= ? AND UM_TENANT_ID=?";
    public static final String UPDATE_ROLE_NAME_SQL = "UPDATE UM_ROLE set UM_ROLE_NAME=? WHERE UM_ROLE_NAME = ? AND UM_TENANT_ID=?";
    public static final String ADD_USER_PROPERTY_SQL = "INSERT INTO UM_USER_ATTRIBUTE (UM_USER_ID, UM_ATTR_NAME, UM_ATTR_VALUE, UM_PROFILE_ID, UM_TENANT_ID) VALUES ((SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?), ?, ?, ?, ?)";
    public static final String ADD_USER_PROPERTY_WITH_ID_SQL = "INSERT INTO UM_USER_ATTRIBUTE (UM_USER_ID, "
            + "UM_ATTR_NAME, UM_ATTR_VALUE, UM_PROFILE_ID, UM_TENANT_ID) VALUES ((SELECT UM_ID FROM UM_USER WHERE "
            + "UM_USER_ID=? AND UM_TENANT_ID=?), ?, ?, ?, ?)";
    public static final String UPDATE_USER_PROPERTY_SQL = "UPDATE UM_USER_ATTRIBUTE SET UM_ATTR_VALUE=? WHERE UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?) AND UM_ATTR_NAME=? AND UM_PROFILE_ID=? AND UM_TENANT_ID=?";
    public static final String UPDATE_USER_PROPERTY_WITH_ID_SQL = "UPDATE UM_USER_ATTRIBUTE SET UM_ATTR_VALUE=? WHERE "
            + "UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_ID=? AND UM_TENANT_ID=?) AND UM_ATTR_NAME=? AND "
            + "UM_PROFILE_ID=? AND UM_TENANT_ID=?";
    public static final String UPDATE_USER_PROPERTY_WITH_ID_OPTIMIZED_SQL = "UPDATE UM_USER_ATTRIBUTE SET UM_ATTR_VALUE=? " +
            "WHERE UM_ATTR_NAME=? AND UM_PROFILE_ID=? AND UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_ID=? AND " +
            "UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String SELECT_USER_PROPERTIES_WITH_ID_SQL = "SELECT * FROM UM_USER_ATTRIBUTE WITH (UPDLOCK) " +
            "WHERE UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_ID=? AND UM_TENANT_ID=?) ORDER BY UM_ID;";
    public static final String SELECT_USER_PROPERTIES_WITH_ID_OPTIMIZED_SQL = "SELECT * FROM UM_USER_ATTRIBUTE WITH " +
            "(UPDLOCK) WHERE UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_ID=? AND UM_TENANT_ID=?) AND " +
            "UM_TENANT_ID=? ORDER BY UM_ID;";
    public static final String DELETE_USER_PROPERTY_SQL = "DELETE FROM UM_USER_ATTRIBUTE WHERE UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?) AND UM_ATTR_NAME=? AND UM_PROFILE_ID=? AND UM_TENANT_ID=?";
    public static final String DELETE_USER_PROPERTY_WITH_ID_SQL = "DELETE FROM UM_USER_ATTRIBUTE WHERE UM_USER_ID="
            + "(SELECT UM_ID FROM UM_USER WHERE UM_USER_ID=? AND UM_TENANT_ID=?) AND UM_ATTR_NAME=? AND "
            + "UM_PROFILE_ID=? AND UM_TENANT_ID=?";
    public static final String DELETE_USER_PROPERTY_BY_TENANT_ID_SQL = "DELETE FROM UM_USER_ATTRIBUTE " +
            "WHERE UM_TENANT_ID = ?";
    public static final String USER_NAME_UNIQUE_SQL =
            "SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=?";
    public static final String USER_ID_UNIQUE_SQL_WITH_ID = "SELECT UM_ID FROM UM_USER WHERE UM_USER_ID=?";
    public static final String USER_NAME_UNIQUE_SQL_WITH_ID = "SELECT UM_ID FROM UM_USER_ATTRIBUTE WHERE "
            + "UM_ATTR_NAME=? AND UM_ATTR_VALUE=?";
    public static final String IS_DOMAIN_EXISTING_SQL = "SELECT UM_DOMAIN_ID FROM UM_DOMAIN WHERE UM_DOMAIN_NAME=? AND UM_TENANT_ID=?";
    public static final String ADD_DOMAIN_SQL = "INSERT INTO UM_DOMAIN (UM_DOMAIN_NAME, UM_TENANT_ID) VALUES (?, ?)";
    public static final String CHECK_DOMAIN_ID_EXISTING_SQL = "SELECT UM_DOMAIN_ID FROM UM_DOMAIN WHERE UM_DOMAIN_ID=? AND UM_TENANT_ID=?";
    public static final String UPDATE_DOMAIN_SQL = "UPDATE UM_DOMAIN SET UM_DOMAIN_NAME=? WHERE UM_DOMAIN_NAME=? AND UM_TENANT_ID=?";
    public static final String REMOVE_DOMAIN_FROM_USER_ROLE =
            "DELETE FROM UM_HYBRID_USER_ROLE WHERE UM_DOMAIN_ID=(SELECT UM_DOMAIN_ID FROM UM_DOMAIN WHERE UM_TENANT_ID=? AND UM_DOMAIN_NAME=?)";
    public static final String DELETE_DOMAIN_FROM_USER_ROLE_BY_TENANT_ID = "DELETE FROM UM_HYBRID_USER_ROLE " +
            "WHERE UM_TENANT_ID = ?";
    public static final String DELETE_DOMAIN_SQL = "DELETE FROM UM_DOMAIN WHERE UM_DOMAIN_NAME=? AND UM_TENANT_ID=?";
    public static final String DIGEST_FUNCTION = "PasswordDigest";
    public static final String HASHING_ALGORITHM_PROPERTIES = "Hash.Algorithm.Properties";
    public static final String STORE_SALTED_PASSWORDS = "StoreSaltedPassword";
    public static final String COUNT_INTERNAL_ROLES_SQL = "SELECT COUNT(UM_ID) AS RESULT FROM UM_HYBRID_ROLE WHERE " +
            "UM_ROLE_NAME NOT LIKE '" + APPLICATION_DOMAIN + "%' AND UM_ROLE_NAME LIKE ? AND UM_TENANT_ID = ?";

    // Group related SQL queries.
    public static final String GET_GROUP_ID_FROM_GROUP_NAME_SQL = "SELECT UM_ROLE_UUID FROM UM_ROLE WHERE " +
            "UM_ROLE_NAME = ? AND UM_TENANT_ID = ?";
    public static final String GET_GROUP_NAME_FROM_GROUP_ID_SQL = "SELECT UM_ROLE_NAME FROM UM_ROLE WHERE " +
            "UM_ROLE_UUID = ? AND UM_TENANT_ID = ?";
    public static final String GET_GROUP_FROM_GROUP_NAME_SQL = "SELECT UM_ROLE_UUID, UM_CREATED_TIME, " +
            "UM_LAST_MODIFIED FROM UM_ROLE WHERE UM_ROLE_NAME = ? AND UM_TENANT_ID = ?";
    public static final String GET_GROUP_FROM_GROUP_ID_SQL = "SELECT UM_ROLE_NAME, UM_CREATED_TIME, UM_LAST_MODIFIED " +
            "FROM UM_ROLE WHERE UM_ROLE_UUID = ? AND UM_TENANT_ID = ?";
    public static final String GET_GROUP_FILTER_WITH_GROUP_NAME_SQL = "SELECT UM_ROLE_NAME, UM_ROLE_UUID, " +
            "UM_CREATED_TIME, UM_LAST_MODIFIED FROM UM_ROLE WHERE UM_ROLE_NAME LIKE ? AND UM_TENANT_ID = ? " +
            "ORDER BY UM_ROLE_NAME;";
    public static final String GET_GROUP_FILTER_WITH_GROUP_ID_SQL = "SELECT UM_ROLE_NAME, UM_ROLE_UUID, " +
            "UM_CREATED_TIME, UM_LAST_MODIFIED FROM UM_ROLE WHERE UM_ROLE_UUID LIKE ? AND UM_TENANT_ID = ? " +
            "ORDER BY UM_ROLE_NAME;";
    public static final String GET_GROUP_FILTER_WITH_CREATED_DATE_SQL = "SELECT UM_ROLE_NAME, UM_ROLE_UUID, " +
            "UM_CREATED_TIME, UM_LAST_MODIFIED FROM UM_ROLE WHERE UM_CREATED_TIME = ? AND UM_TENANT_ID = ? " +
            "ORDER BY UM_ROLE_NAME;";
    public static final String GET_GROUP_FILTER_WITH_LAST_MODIFIED_SQL = "SELECT UM_ROLE_NAME, UM_ROLE_UUID, " +
            "UM_CREATED_TIME, UM_LAST_MODIFIED FROM UM_ROLE WHERE UM_LAST_MODIFIED = ? AND UM_TENANT_ID = ? " +
            "ORDER BY UM_ROLE_NAME;";
    public static final String ADD_GROUP_SQL = "INSERT INTO UM_ROLE (UM_ROLE_UUID, UM_ROLE_NAME, UM_TENANT_ID, " +
            "UM_CREATED_TIME, UM_LAST_MODIFIED) VALUES (?, ?, ?, ?, ?)";
    public static final String UPDATE_GROUP_NAME_SQL = "UPDATE UM_ROLE set UM_ROLE_NAME = ?, UM_LAST_MODIFIED = ? " +
            "WHERE UM_ROLE_UUID = ? AND UM_TENANT_ID = ?";
    public static final String UPDATE_GROUP_LAST_MODIFIED_SQL = "UPDATE UM_ROLE set UM_LAST_MODIFIED = ? " +
            "WHERE UM_ROLE_NAME = ? AND UM_TENANT_ID = ?";
    public static final String UPDATE_GROUP_LAST_MODIFIED_WITH_GROUP_ID_SQL = "UPDATE UM_ROLE set " +
            "UM_LAST_MODIFIED = ? WHERE UM_ROLE_UUID = ? AND UM_TENANT_ID = ?";

    // properties
    public static final String DATASOURCE = "dataSource";
    public static final String URL = "url";
    public static final String USER_NAME = "userName";
    public static final String PASSWORD = "password";
    public static final String DRIVER_NAME = "driverName";
    public static final String MAX_ACTIVE = "maxActive";
    public static final String MAX_WAIT = "maxWait";
    public static final String MIN_IDLE = "minIdle";
    public static final String MAX_IDLE = "maxIdle";
    public static final String VALIDATION_QUERY = "validationQuery";
    public static final String DIALECT_FLAG = "dialectFlag";
    public static final String TEST_WHILE_IDLE = "testWhileIdle";
    public static final String TIME_BETWEEN_EVICTION_RUNS_MILLIS = "timeBetweenEvictionRunsMillis";
    public static final String MIN_EVIC_TABLE_IDLE_TIME_MILLIS = "minEvictableIdleTimeMillis";
    public static final String NUM_TESTS_PEREVICTION_RUN = "numTestsPerEvictionRun";
    public static final String DEFAULT_AUTO_COMMIT = "defaultAutoCommit";
    public static final String DEFAULT_READ_ONLY = "defaultReadOnly";
    public static final String DEFAULT_TRANSACTION_ISOLATION="defaultTransactionIsolation";
    public static final String DEFAULT_CATALOG = "defaultCatalog";
    public static final String INITIAL_SIZE = "initialSize";
    public static final String TEST_ON_RETURN = "testOnReturn";
    public static final String TEST_ON_BORROW = "testOnBorrow";
    public static final String VALIDATOR_CLASS_NAME = "validatorClassName";
    public static final String NUM_TESTS_PER_EVICTION_RUN = "numTestsPerEvictionRun";
    public static final String ACCESS_TO_UNDERLYING_CONNECTION_ALLOWED = "accessToUnderlyingConnectionAllowed";
    public static final String REMOVE_ABANDONED = "removeAbandoned";
    public static final String REMOVE_ABANDONED_TIMEOUT = "removeAbandonedTimeout";
    public static final String LOG_ABANDONED = "logAbandoned";
    public static final String CONNECTION_PROPERTIES = "connectionProperties";
    public static final String INIT_SQL = "initSQL";
    public static final String JDBC_INTERCEPTORS = "jdbcInterceptors";
    public static final String JMX_ENABLED = "jmxEnabled";
    public static final String FAIR_QUEUE = "fairQueue";
    public static final String ABANDON_WHEN_PERCENTAGE_FULL = "abandonWhenPercentageFull";
    public static final String MAX_AGE = "maxAge";
    public static final String USE_EQUALS = "useEquals";
    public static final String SUSPECT_TIMEOUT = "suspectTimeout";
    public static final String VALIDATION_QUERY_TIMEOUT = "validationQueryTimeout";
    public static final String ALTERNATE_USERNAME_ALLOWED = "alternateUsernameAllowed";
    public static final String COMMIT_ON_RETURN = "commitOnReturn";
    public static final String ROLLBACK_ON_RETURN = "rollbackOnReturn";

    public static final class TX_ISOLATION_LEVELS {
        public static final String NONE = "NONE";
        public static final String READ_COMMITTED = "READ_COMMITTED";
        public static final String READ_UNCOMMITTED = "READ_UNCOMMITTED";
        public static final String REPEATABLE_READ = "REPEATABLE_READ";
        public static final String SERIALIZABLE = "SERIALIZABLE";
    }

    // mssql
    public static final String ADD_USER_TO_ROLE_MSSQL_SQL = "INSERT INTO UM_USER_ROLE (UM_USER_ID, UM_ROLE_ID, UM_TENANT_ID) SELECT (SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?),(SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?),(?)";
    public static final String ADD_ROLE_TO_USER_MSSQL_SQL = "INSERT INTO UM_USER_ROLE (UM_ROLE_ID, UM_USER_ID, UM_TENANT_ID) SELECT (SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?),(SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?), (?)";
    public static final String ADD_USER_PROPERTY_MSSQL_SQL = "INSERT INTO UM_USER_ATTRIBUTE (UM_USER_ID, UM_ATTR_NAME, UM_ATTR_VALUE, UM_PROFILE_ID, UM_TENANT_ID) SELECT (SELECT UM_ID FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?), (?), (?), (?), (?)";
    public static final String ADD_USER_TO_ROLE_MSSQL = "AddUserToRoleSQL-mssql";
    public static final String ADD_ROLE_TO_USER_MSSQL = "AddRoleToUserSQL-mssql";
    public static final String ADD_USER_PROPERTY_MSSQL = "AddUserPropertySQL-mssql";
    //openedge
    public static final String ADD_USER_TO_ROLE_OPENEDGE_SQL = "INSERT INTO UM_USER_ROLE (UM_USER_ID, UM_ROLE_ID, UM_TENANT_ID) SELECT UU.UM_ID, UR.UM_ID, ? FROM UM_USER UU, UM_ROLE UR WHERE UU.UM_USER_NAME=? AND UU.UM_TENANT_ID=? AND UR.UM_ROLE_NAME=? AND UR.UM_TENANT_ID=?";
    public static final String ADD_ROLE_TO_USER_OPENEDGE_SQL = "INSERT INTO UM_USER_ROLE (UM_ROLE_ID, UM_USER_ID, UM_TENANT_ID) SELECT UR.UM_ID, UU.UM_ID, ? FROM UM_ROLE UR, UM_USER UU WHERE UR.UM_ROLE_NAME=? AND UR.UM_TENANT_ID=? AND UU.UM_USER_NAME=? AND UU.UM_TENANT_ID=?";
    public static final String ADD_USER_PROPERTY_OPENEDGE_SQL = "INSERT INTO UM_USER_ATTRIBUTE (UM_USER_ID, UM_ATTR_NAME, UM_ATTR_VALUE, UM_PROFILE_ID, UM_TENANT_ID) SELECT UM_ID, ?, ?, ?, ? FROM UM_USER WHERE UM_USER_NAME=? AND UM_TENANT_ID=?";
    public static final String ADD_USER_TO_ROLE_OPENEDGE = "AddUserToRoleSQL-openedge";
    public static final String ADD_ROLE_TO_USER_OPENEDGE = "AddRoleToUserSQL-openedge";
    public static final String ADD_USER_PROPERTY_OPENEDGE = "AddUserPropertySQL-openedge";
    public static final String PROP_ENABLE_OPTIMIZED_JDBC_SEARCH = "JDBCUserStore.enableOptimizedJDBCSearch";
    private JDBCRealmConstants() {
    }
}
