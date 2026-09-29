package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC3393o1;
import p000.AbstractC3401o9;
import p000.C0012aa;
import p000.C0840ca;
import p000.C3309ls;
import p000.C3386nv;
import p000.C3437ov;
import p000.C3680vc;
import p000.InterfaceC3364n9;
import p000.ed1;
import p000.ho2;
import p000.i1a;
import p000.l48;
import p000.nc2;
import p000.oc2;
import p000.or3;
import p000.p80;
import p000.qc2;
import p000.qn3;
import p000.si4;
import p000.ux5;
import p000.zj7;

/* JADX INFO: renamed from: androidx.security.crypto.c */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC0761c implements SharedPreferences {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f7055a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f7056b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final InterfaceC3364n9 f7057c;

    /* JADX INFO: renamed from: d */
    public final nc2 f7058d;

    public SharedPreferencesC0761c(SharedPreferences sharedPreferences, InterfaceC3364n9 interfaceC3364n9, nc2 nc2Var) {
        this.f7055a = sharedPreferences;
        this.f7057c = interfaceC3364n9;
        this.f7058d = nc2Var;
    }

    /* JADX INFO: renamed from: a */
    public static SharedPreferencesC0761c m2865a(Context context, si4 si4Var, EncryptedSharedPreferences$PrefKeyEncryptionScheme encryptedSharedPreferences$PrefKeyEncryptionScheme, EncryptedSharedPreferences$PrefValueEncryptionScheme encryptedSharedPreferences$PrefValueEncryptionScheme) {
        C3309ls c3309lsM18293D;
        C3309ls c3309lsM18293D2;
        String str = si4Var.f60898b;
        int i = oc2.f54168a;
        l48.m15796h(qc2.f57561b);
        if (!i1a.m13628a()) {
            l48.m15794f(new C0840ca(C3680vc.class, new zj7[]{new C0012aa(5, nc2.class)}, 6), true);
        }
        AbstractC3401o9.m17862a();
        Context applicationContext = context.getApplicationContext();
        ed1 ed1Var = new ed1();
        ed1Var.f37038f = encryptedSharedPreferences$PrefKeyEncryptionScheme.getKeyTemplate();
        if (applicationContext == null) {
            C3386nv.m17626m("need an Android context");
            return null;
        }
        ed1Var.f37033a = applicationContext;
        ed1Var.f37034b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        ed1Var.f37035c = "iterable-encrypted-shared-preferences";
        String strM17734i = AbstractC3393o1.m17734i("android-keystore://", str);
        if (!strM17734i.startsWith("android-keystore://")) {
            C3386nv.m17626m("key URI must start with android-keystore://");
            return null;
        }
        ed1Var.f37036d = strM17734i;
        qn3 qn3VarM11050j = ed1Var.m11050j();
        synchronized (qn3VarM11050j) {
            c3309lsM18293D = ((or3) qn3VarM11050j.f57974a).m18293D();
        }
        ed1 ed1Var2 = new ed1();
        ed1Var2.f37038f = encryptedSharedPreferences$PrefValueEncryptionScheme.getKeyTemplate();
        ed1Var2.f37033a = applicationContext;
        ed1Var2.f37034b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        ed1Var2.f37035c = "iterable-encrypted-shared-preferences";
        String strM17734i2 = AbstractC3393o1.m17734i("android-keystore://", str);
        if (!strM17734i2.startsWith("android-keystore://")) {
            C3386nv.m17626m("key URI must start with android-keystore://");
            return null;
        }
        ed1Var2.f37036d = strM17734i2;
        qn3 qn3VarM11050j2 = ed1Var2.m11050j();
        synchronized (qn3VarM11050j2) {
            c3309lsM18293D2 = ((or3) qn3VarM11050j2.f57974a).m18293D();
        }
        return new SharedPreferencesC0761c(applicationContext.getSharedPreferences("iterable-encrypted-shared-preferences", 0), (InterfaceC3364n9) c3309lsM18293D2.m16522z(InterfaceC3364n9.class), (nc2) c3309lsM18293D.m16522z(nc2.class));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2866d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    /* JADX INFO: renamed from: b */
    public final String m2867b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(p80.m18950b(this.f7058d.mo17343a(str.getBytes(StandardCharsets.UTF_8), "iterable-encrypted-shared-preferences".getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            ho2.m13386g("Could not encrypt key. ", e2.getMessage(), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m2868c(String str) {
        if (m2866d(str)) {
            throw new SecurityException(ux5.m22990m(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strM2867b = m2867b(str);
            String string = this.f7055a.getString(strM2867b, null);
            if (string != null) {
                byte[] bArrM18949a = p80.m18949a(string);
                InterfaceC3364n9 interfaceC3364n9 = this.f7057c;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(interfaceC3364n9.mo9871b(bArrM18949a, strM2867b.getBytes(charset)));
                byteBufferWrap.position(0);
                int i = byteBufferWrap.getInt();
                EncryptedSharedPreferences$EncryptedType encryptedSharedPreferences$EncryptedTypeFromId = EncryptedSharedPreferences$EncryptedType.fromId(i);
                if (encryptedSharedPreferences$EncryptedTypeFromId == null) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
                }
                switch (AbstractC0759a.f7050a[encryptedSharedPreferences$EncryptedTypeFromId.ordinal()]) {
                    case 1:
                        int i2 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                        byteBufferWrap.limit(i2);
                        String string2 = charset.decode(byteBufferSlice).toString();
                        if (!string2.equals("__NULL__")) {
                            return string2;
                        }
                        break;
                    case 2:
                        return Integer.valueOf(byteBufferWrap.getInt());
                    case 3:
                        return Long.valueOf(byteBufferWrap.getLong());
                    case 4:
                        return Float.valueOf(byteBufferWrap.getFloat());
                    case 5:
                        return Boolean.valueOf(byteBufferWrap.get() != 0);
                    case 6:
                        C3437ov c3437ov = new C3437ov(0);
                        while (byteBufferWrap.hasRemaining()) {
                            int i3 = byteBufferWrap.getInt();
                            ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                            byteBufferSlice2.limit(i3);
                            byteBufferWrap.position(byteBufferWrap.position() + i3);
                            c3437ov.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                        }
                        if (c3437ov.f55023c != 1 || !"__NULL__".equals(c3437ov.f55022b[0])) {
                            return c3437ov;
                        }
                        break;
                        break;
                    default:
                        throw new SecurityException("Unhandled type for encrypted pref value: " + encryptedSharedPreferences$EncryptedTypeFromId);
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            ho2.m13386g("Could not decrypt value. ", e.getMessage(), e);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (m2866d(str)) {
            throw new SecurityException(ux5.m22990m(str, " is a reserved key for the encryption keyset."));
        }
        return this.f7055a.contains(m2867b(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC0760b(this, this.f7055a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f7055a.getAll().entrySet()) {
            if (!m2866d(entry.getKey())) {
                try {
                    String str = new String(this.f7058d.mo17344b(p80.m18949a(entry.getKey()), "iterable-encrypted-shared-preferences".getBytes()), StandardCharsets.UTF_8);
                    String str2 = str.equals("__NULL__") ? null : str;
                    map.put(str2, m2868c(str2));
                } catch (GeneralSecurityException e) {
                    ho2.m13386g("Could not decrypt key. ", e.getMessage(), e);
                    return null;
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objM2868c = m2868c(str);
        return objM2868c instanceof Boolean ? ((Boolean) objM2868c).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objM2868c = m2868c(str);
        return objM2868c instanceof Float ? ((Float) objM2868c).floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objM2868c = m2868c(str);
        return objM2868c instanceof Integer ? ((Integer) objM2868c).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objM2868c = m2868c(str);
        return objM2868c instanceof Long ? ((Long) objM2868c).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objM2868c = m2868c(str);
        return objM2868c instanceof String ? (String) objM2868c : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objM2868c = m2868c(str);
        Set c3437ov = objM2868c instanceof Set ? (Set) objM2868c : new C3437ov(0);
        return c3437ov.size() > 0 ? c3437ov : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f7056b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f7056b.remove(onSharedPreferenceChangeListener);
    }
}
