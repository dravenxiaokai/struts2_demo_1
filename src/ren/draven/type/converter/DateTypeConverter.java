package ren.draven.type.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class DateTypeConverter extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map<String, Object> context, Object value, Class toType) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		if (toType == Date.class) {
			String[] params = (String[]) value;
			try {
				return dateFormat.parse(params[0]);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} else if (toType == String.class) {
			Date date = (Date) value;
			return dateFormat.format(date);
		}
		return null;
	}

}
