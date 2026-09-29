package p356r5;

import com.bumptech.glide.C2085g;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: r5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8733c<T> implements InterfaceC8738h<T> {

    /* JADX INFO: renamed from: b */
    public final List f46325b;

    @SafeVarargs
    public C8733c(InterfaceC8738h<T>... interfaceC8738hArr) {
        if (interfaceC8738hArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f46325b = Arrays.asList(interfaceC8738hArr);
    }

    @Override // p356r5.InterfaceC8738h
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m mo160a(C2085g c2085g, InterfaceC9207m interfaceC9207m, int i10, int i11) {
        Iterator it = this.f46325b.iterator();
        InterfaceC9207m interfaceC9207m2 = interfaceC9207m;
        while (it.hasNext()) {
            InterfaceC9207m interfaceC9207mMo160a = ((InterfaceC8738h) it.next()).mo160a(c2085g, interfaceC9207m2, i10, i11);
            if (interfaceC9207m2 != null && !interfaceC9207m2.equals(interfaceC9207m) && !interfaceC9207m2.equals(interfaceC9207mMo160a)) {
                interfaceC9207m2.mo157b();
            }
            interfaceC9207m2 = interfaceC9207mMo160a;
        }
        return interfaceC9207m2;
    }

    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        Iterator it = this.f46325b.iterator();
        while (it.hasNext()) {
            ((InterfaceC8738h) it.next()).mo162b(messageDigest);
        }
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        if (obj instanceof C8733c) {
            return this.f46325b.equals(((C8733c) obj).f46325b);
        }
        return false;
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        return this.f46325b.hashCode();
    }
}
