-- Insert 100 pincodes (10 pincodes for each city)
BEGIN
    FOR i IN 1..10 LOOP
        -- Andhra Pradesh
        FOR j IN 1..10 LOOP
            INSERT INTO Pincode_M (pincode, city_id,status)
            VALUES ('5'||LPAD(i,3, '0')||LPAD(j, 2, '0')||'0', j,1);
        END LOOP;

        -- Arunachal Pradesh
        FOR j IN 1..10 LOOP
            INSERT INTO Pincode_M (pincode, city_id,status)
            VALUES ('6'||LPAD(i,3, '0')||LPAD(j, 2, '0')||'0', j + 10,1);
        END LOOP;

        -- Assam
        FOR j IN 1..10 LOOP
            INSERT INTO Pincode_M (pincode, city_id,status)
            VALUES ('7'||LPAD(i,3, '0')||LPAD(j, 2, '0')||'0', j + 20,1);
        END LOOP;

        -- Uttar Pradesh
        FOR j IN 1..10 LOOP
            INSERT INTO Pincode_M (pincode, city_id,status)
            VALUES ('4'||LPAD(i,3, '0')||LPAD(j, 2, '0')||'0', j + 30,1);
        END LOOP;

        -- Chhattisgarh
        FOR j IN 1..10 LOOP
            INSERT INTO Pincode_M (pincode, city_id,status)
            VALUES ('8'||LPAD(i,3, '0')||LPAD(j, 2, '0')||'0', j + 40,1);
        END LOOP;

        -- Goa
        FOR j IN 1..10 LOOP
            INSERT INTO Pincode_M (pincode, city_id,status)
            VALUES ('9'||LPAD(i,3, '0')||LPAD(j, 2, '0')||'0', j + 50,1);
        END LOOP;

        -- Gujarat
        FOR j IN 1..10 LOOP
            INSERT INTO Pincode_M (pincode, city_id,status)
            VALUES ('10'||LPAD(i,2, '0')||LPAD(j, 2, '0')||'0', j + 60,1);
        END LOOP;

        -- Haryana
        FOR j IN 1..10 LOOP
            INSERT INTO Pincode_M (pincode, city_id,status)
            VALUES ('1'||LPAD(i,3, '0')||LPAD(j, 2, '0')||'0', j + 70,1);
        END LOOP;

        -- Himachal Pradesh
        FOR j IN 1..10 LOOP
            INSERT INTO Pincode_M (pincode, city_id,status)
            VALUES ('2'||LPAD(i,3, '0')||LPAD(j, 2, '0')||'0', j + 80,1);
        END LOOP;

        -- Jammu and Kashmir
        FOR j IN 1..10 LOOP
            INSERT INTO Pincode_M (pincode, city_id,status)
            VALUES ('3'||LPAD(i,3, '0')||LPAD(j, 2, '0')||'0', j + 90,1);
        END LOOP;
    END LOOP;
END;
/


update city_m set city_name='City '||city_id;

INSERT INTO country_m (country_isd_code, country_iso_code, country_name, currency_name, currency_code, status) VALUES ('1', 'US', 'United States', 'US Dollar', 'USD', 1);
INSERT INTO country_m (country_isd_code, country_iso_code, country_name, currency_name, currency_code, status) VALUES ('91', 'IN', 'India', 'Indian Rupee', 'INR', 1);
INSERT INTO country_m (country_isd_code, country_iso_code, country_name, currency_name, currency_code, status) VALUES ('44', 'GB', 'United Kingdom', 'British Pound', 'GBP', 1);
INSERT INTO country_m (country_isd_code, country_iso_code, country_name, currency_name, currency_code, status) VALUES ('81', 'JP', 'Japan', 'Japanese Yen', 'JPY', 1);
INSERT INTO country_m (country_isd_code, country_iso_code, country_name, currency_name, currency_code, status) VALUES ('86', 'CN', 'China', 'Chinese Yuan', 'CNY', 1);
INSERT INTO country_m (country_isd_code, country_iso_code, country_name, currency_name, currency_code, status) VALUES ('61', 'AU', 'Australia', 'Australian Dollar', 'AUD', 1);
INSERT INTO country_m (country_isd_code, country_iso_code, country_name, currency_name, currency_code, status) VALUES ('1', 'CA', 'Canada', 'Canadian Dollar', 'CAD', 1);
INSERT INTO country_m (country_isd_code, country_iso_code, country_name, currency_name, currency_code, status) VALUES ('41', 'CH', 'Switzerland', 'Swiss Franc', 'CHF', 1);
INSERT INTO country_m (country_isd_code, country_iso_code, country_name, currency_name, currency_code, status) VALUES ('65', 'SG', 'Singapore', 'Singapore Dollar', 'SGD', 1);
INSERT INTO country_m (country_isd_code, country_iso_code, country_name, currency_name, currency_code, status) VALUES ('52', 'MX', 'Mexico', 'Mexican Peso', 'MXN', 1);
