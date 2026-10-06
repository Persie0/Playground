package p000;

import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.MissingResourceException;
import java.util.Properties;

/* JADX INFO: renamed from: b */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0054b {

    /* JADX INFO: renamed from: a */
    private static final Properties f2832a;

    static {
        Properties properties = new Properties();
        f2832a = properties;
        try {
            InputStream resourceAsStream = System.getSecurityManager() != null ? (InputStream) AccessController.doPrivileged(new C0081c(C0121d.class)) : C0121d.class.getResourceAsStream("/android/icumessageformat/ICUConfig.properties");
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
            }
        } catch (IOException e) {
        } catch (MissingResourceException e2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m2150a() {
        String property;
        if (System.getSecurityManager() != null) {
            try {
                property = (String) AccessController.doPrivileged(new C0000a());
            } catch (AccessControlException e) {
                property = null;
            }
        } else {
            property = System.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode");
        }
        return property == null ? f2832a.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL") : property;
    }
}
