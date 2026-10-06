package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvw implements bvl {

    /* JADX INFO: renamed from: a */
    private static final Set f4562a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* JADX INFO: renamed from: b */
    private static final Set f4563b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content")));

    /* JADX INFO: renamed from: c */
    private final bvv f4564c;

    /* JADX INFO: renamed from: d */
    private final bko f4565d;

    public bvw(bvv bvvVar, bko bkoVar, byte[] bArr) {
        this.f4564c = bvvVar;
        this.f4565d = bkoVar;
    }

    @Override // p000.bvl
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3083a(Object obj) {
        Uri uri = (Uri) obj;
        bko bkoVar = this.f4565d;
        return ((bkoVar == null || !bkoVar.m2607a(bpb.class)) ? f4562a : f4563b).contains(uri.getScheme());
    }

    @Override // p000.bvl
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ C1058va mo3084b(Object obj, int i, int i2, bqr bqrVar) {
        Uri uri = (Uri) obj;
        return new C1058va(new cat(uri), this.f4564c.mo3104a(uri));
    }
}
