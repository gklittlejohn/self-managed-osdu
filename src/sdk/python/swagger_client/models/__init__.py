# coding: utf-8

# flake8: noqa
"""
    self-managed-osdu

    Rest API Documentation for Self Managed OSDU  # noqa: E501

    OpenAPI spec version: 0.11.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

# import models into model package
from swagger_client.models.entitlement_group_properties import EntitlementGroupProperties
from swagger_client.models.entitlement_group_response import EntitlementGroupResponse
from swagger_client.models.entitlement_member_dto import EntitlementMemberDto
from swagger_client.models.legal_tag_dto import LegalTagDto
from swagger_client.models.legal_tag_dtos import LegalTagDtos
from swagger_client.models.legal_tag_invalid_response import LegalTagInvalidResponse
from swagger_client.models.legal_tag_invalid_response_list import LegalTagInvalidResponseList
from swagger_client.models.legal_tag_properties import LegalTagProperties
from swagger_client.models.legal_tag_property_values import LegalTagPropertyValues
from swagger_client.models.legal_tag_request import LegalTagRequest
from swagger_client.models.legal_tag_update_dto import LegalTagUpdateDto
from swagger_client.models.partition_dto import PartitionDto
from swagger_client.models.partition_property import PartitionProperty
from swagger_client.models.search_app_error import SearchAppError
from swagger_client.models.search_by_bounding_box import SearchByBoundingBox
from swagger_client.models.search_by_distance import SearchByDistance
from swagger_client.models.search_by_geo_polygon import SearchByGeoPolygon
from swagger_client.models.search_cursor_query_request import SearchCursorQueryRequest
from swagger_client.models.search_cursor_query_response import SearchCursorQueryResponse
from swagger_client.models.search_point import SearchPoint
from swagger_client.models.search_query_request import SearchQueryRequest
from swagger_client.models.search_query_response import SearchQueryResponse
from swagger_client.models.search_spatial_filter import SearchSpatialFilter
from swagger_client.models.storage_acl import StorageAcl
from swagger_client.models.storage_bulk_update_records_response import StorageBulkUpdateRecordsResponse
from swagger_client.models.storage_delete_record_error import StorageDeleteRecordError
from swagger_client.models.storage_error_response import StorageErrorResponse
from swagger_client.models.storage_legal import StorageLegal
from swagger_client.models.storage_multi_record_ids import StorageMultiRecordIds
from swagger_client.models.storage_patch_operation import StoragePatchOperation
from swagger_client.models.storage_query_response import StorageQueryResponse
from swagger_client.models.storage_record import StorageRecord
from swagger_client.models.storage_record_bulk_update_param import StorageRecordBulkUpdateParam
from swagger_client.models.storage_record_data import StorageRecordData
from swagger_client.models.storage_record_history import StorageRecordHistory
from swagger_client.models.storage_record_query import StorageRecordQuery
from swagger_client.models.storage_record_versions import StorageRecordVersions