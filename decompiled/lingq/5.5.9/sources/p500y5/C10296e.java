package p500y5;

import java.io.InputStream;
import java.net.URL;
import p356r5.C8735e;
import p474x5.C10082g;
import p474x5.C10094s;
import p474x5.InterfaceC10090o;
import p474x5.InterfaceC10091p;

/* JADX INFO: renamed from: y5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10296e implements InterfaceC10090o<URL, InputStream> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10090o<C10082g, InputStream> f51805a;

    /* JADX INFO: renamed from: y5.e$a */
    public static class a implements InterfaceC10091p<URL, InputStream> {
        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<URL, InputStream> mo18922c(C10094s c10094s) {
            return new C10296e(c10094s.m18941b(C10082g.class, InputStream.class));
        }
    }

    public C10296e(InterfaceC10090o<C10082g, InputStream> interfaceC10090o) {
        this.f51805a = interfaceC10090o;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo18919a(URL url) {
        return true;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a<InputStream> mo18920b(URL url, int i10, int i11, C8735e c8735e) {
        return this.f51805a.mo18920b(new C10082g(url), i10, i11, c8735e);
    }
}
