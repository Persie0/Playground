package p006a5;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bg.C1380a;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C6898a;
import p007a6.C0028g;
import p087e6.C5374c;
import p110f6.InterfaceC5471b;
import p356r5.C8735e;
import p392t5.InterfaceC9207m;
import p407u5.InterfaceC9452c;
import p465wm.C9974d;

/* JADX INFO: renamed from: a5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0020c implements InterfaceC5471b {

    /* JADX INFO: renamed from: a */
    public final Object f13a;

    /* JADX INFO: renamed from: b */
    public final Object f14b;

    /* JADX INFO: renamed from: c */
    public final Object f15c;

    public C0020c() {
        this.f13a = null;
        this.f14b = null;
        this.f15c = null;
    }

    public /* synthetic */ C0020c(Object obj, Object obj2, Object obj3) {
        this.f13a = obj;
        this.f14b = obj2;
        this.f15c = obj3;
    }

    public C0020c(C6898a c6898a, C9974d c9974d) {
        this.f13a = c6898a;
        this.f14b = c9974d;
        this.f15c = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C1380a m64a() {
        String str;
        String str2 = (String) this.f13a;
        if (str2 != null && (str = (String) this.f14b) != null) {
            String str3 = (String) this.f15c;
            if (str3 == null) {
                str3 = "";
            }
            return new C1380a(str2, str, str3, Collections.emptyList(), Collections.emptyList());
        }
        return new C1380a();
    }

    @Override // p110f6.InterfaceC5471b
    /* JADX INFO: renamed from: b */
    public final InterfaceC9207m mo65b(InterfaceC9207m interfaceC9207m, C8735e c8735e) {
        Drawable drawable = (Drawable) interfaceC9207m.get();
        if (drawable instanceof BitmapDrawable) {
            return ((InterfaceC5471b) this.f14b).mo65b(C0028g.m155e(((BitmapDrawable) drawable).getBitmap(), (InterfaceC9452c) this.f13a), c8735e);
        }
        if (drawable instanceof C5374c) {
            return ((InterfaceC5471b) this.f15c).mo65b(interfaceC9207m, c8735e);
        }
        return null;
    }
}
