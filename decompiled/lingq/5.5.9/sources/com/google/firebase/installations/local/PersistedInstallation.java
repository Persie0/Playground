package com.google.firebase.installations.local;

import ae.C0065e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PersistedInstallation {

    /* JADX INFO: renamed from: a */
    public File f16267a;

    /* JADX INFO: renamed from: b */
    public final C0065e f16268b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(C0065e c0065e) {
        this.f16268b = c0065e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final File m9198a() {
        if (this.f16267a == null) {
            synchronized (this) {
                if (this.f16267a == null) {
                    C0065e c0065e = this.f16268b;
                    c0065e.m437a();
                    this.f16267a = new File(c0065e.f171a.getFilesDir(), "PersistedInstallation." + this.f16268b.m438c() + ".json");
                }
            }
        }
        return this.f16267a;
    }

    /* JADX INFO: renamed from: b */
    public final void m9199b(C3220a c3220a) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c3220a.f16269b);
            jSONObject.put("Status", c3220a.f16270c.ordinal());
            jSONObject.put("AuthToken", c3220a.f16271d);
            jSONObject.put("RefreshToken", c3220a.f16272e);
            jSONObject.put("TokenCreationEpochInSecs", c3220a.f16274g);
            jSONObject.put("ExpiresInSecs", c3220a.f16273f);
            jSONObject.put("FisError", c3220a.f16275h);
            C0065e c0065e = this.f16268b;
            c0065e.m437a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", c0065e.f171a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(m9198a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final C3220a m9200c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m9198a());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        RegistrationStatus registrationStatus = RegistrationStatus.ATTEMPT_MIGRATION;
        int iOptInt = jSONObject.optInt("Status", registrationStatus.ordinal());
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i11 = AbstractC3221b.f16283a;
        C3220a.a aVar = new C3220a.a();
        aVar.f16281f = 0L;
        aVar.m9210b(registrationStatus);
        aVar.f16280e = 0L;
        aVar.f16276a = strOptString;
        aVar.m9210b(RegistrationStatus.values()[iOptInt]);
        aVar.f16278c = strOptString2;
        aVar.f16279d = strOptString3;
        aVar.f16281f = Long.valueOf(jOptLong);
        aVar.f16280e = Long.valueOf(jOptLong2);
        aVar.f16282g = strOptString4;
        return aVar.m9209a();
    }
}
