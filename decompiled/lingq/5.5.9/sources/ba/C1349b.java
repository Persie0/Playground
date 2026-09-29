package ba;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* JADX INFO: renamed from: ba.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1349b {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f8180a;

    /* JADX INFO: renamed from: b */
    public final DataOutputStream f8181b;

    public C1349b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f8180a = byteArrayOutputStream;
        this.f8181b = new DataOutputStream(byteArrayOutputStream);
    }
}
