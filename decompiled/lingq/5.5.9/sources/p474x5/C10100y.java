package p474x5;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p356r5.C8735e;

/* JADX INFO: renamed from: x5.y */
/* JADX INFO: loaded from: classes.dex */
public final class C10100y<Data> implements InterfaceC10090o<Uri, Data> {

    /* JADX INFO: renamed from: b */
    public static final Set<String> f51222b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a */
    public final InterfaceC10090o<C10082g, Data> f51223a;

    /* JADX INFO: renamed from: x5.y$a */
    public static class a implements InterfaceC10091p<Uri, InputStream> {
        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Uri, InputStream> mo18922c(C10094s c10094s) {
            return new C10100y(c10094s.m18941b(C10082g.class, InputStream.class));
        }
    }

    public C10100y(InterfaceC10090o<C10082g, Data> interfaceC10090o) {
        this.f51223a = interfaceC10090o;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final boolean mo18919a(Uri uri) {
        return f51222b.contains(uri.getScheme());
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a mo18920b(Uri uri, int i10, int i11, C8735e c8735e) {
        return this.f51223a.mo18920b(new C10082g(uri.toString()), i10, i11, c8735e);
    }
}
