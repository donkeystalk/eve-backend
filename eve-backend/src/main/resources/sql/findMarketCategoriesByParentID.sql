SELECT marketGroupID, marketGroupName, parentGroupID
FROM invmarketgroups
WHERE parentGroupID = :parentGroupID