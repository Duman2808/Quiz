package iitu.kz.model.converter;

import javax.persistence.AttributeConverter;

import iitu.kz.model.Role;

public class RoleConventer implements AttributeConverter<Role, String> {

	@Override
	public String convertToDatabaseColumn(Role role) {
		return role.shortName;
	}
	
	@Override
	public Role convertToEntityAttribute(String dbData) {
		return Role.fromShortName(dbData);
	}
}
