package p500y5;

import com.bumptech.glide.load.data.C2103j;
import java.io.InputStream;
import java.util.ArrayDeque;
import p356r5.C8734d;
import p356r5.C8735e;
import p474x5.C10082g;
import p474x5.C10088m;
import p474x5.C10089n;
import p474x5.C10094s;
import p474x5.InterfaceC10090o;
import p474x5.InterfaceC10091p;

/* JADX INFO: renamed from: y5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10292a implements InterfaceC10090o<C10082g, InputStream> {

    /* JADX INFO: renamed from: b */
    public static final C8734d<Integer> f51781b = C8734d.m16962a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: a */
    public final C10089n<C10082g, C10082g> f51782a;

    /* JADX INFO: renamed from: y5.a$a */
    public static class a implements InterfaceC10091p<C10082g, InputStream> {

        /* JADX INFO: renamed from: a */
        public final C10089n<C10082g, C10082g> f51783a = new C10089n<>();

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<C10082g, InputStream> mo18922c(C10094s c10094s) {
            return new C10292a(this.f51783a);
        }
    }

    public C10292a(C10089n<C10082g, C10082g> c10089n) {
        this.f51782a = c10089n;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo18919a(C10082g c10082g) {
        return true;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a<InputStream> mo18920b(C10082g c10082g, int i10, int i11, C8735e c8735e) {
        C10082g c10082g2 = c10082g;
        C10089n<C10082g, C10082g> c10089n = this.f51782a;
        if (c10089n != null) {
            C10089n.a aVarM18938a = C10089n.a.m18938a(c10082g2);
            C10088m c10088m = c10089n.f51174a;
            Object objM14873a = c10088m.m14873a(aVarM18938a);
            ArrayDeque arrayDeque = C10089n.a.f51175d;
            synchronized (arrayDeque) {
                arrayDeque.offer(aVarM18938a);
            }
            C10082g c10082g3 = (C10082g) objM14873a;
            if (c10082g3 == null) {
                c10088m.m14876d(C10089n.a.m18938a(c10082g2), c10082g2);
            } else {
                c10082g2 = c10082g3;
            }
        }
        return new InterfaceC10090o.a<>(c10082g2, new C2103j(c10082g2, ((Integer) c8735e.m16963c(f51781b)).intValue()));
    }
}
