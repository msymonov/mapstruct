/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.builtin.jodatime.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ap.test.builtin.jodatime.bean.LocalDateBean;
import org.mapstruct.ap.test.builtin.jodatime.bean.XmlGregorianCalendarBean;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author Sjaak Derksen
 */
@Mapper
public interface LocalDateToXmlGregorianCalendar {

    LocalDateToXmlGregorianCalendar INSTANCE = Mappers.getMapper( LocalDateToXmlGregorianCalendar.class );

    @Mapping( target = "XMLGregorianCalendar", source = "localDate")
    XmlGregorianCalendarBean toXmlGregorianCalendarBean( LocalDateBean in );

}
