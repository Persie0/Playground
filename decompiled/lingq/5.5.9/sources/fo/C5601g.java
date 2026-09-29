package fo;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6793a;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5257t;
import p543do.InterfaceC5240k0;

/* JADX INFO: renamed from: fo.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C5601g implements InterfaceC5240k0 {

    /* JADX INFO: renamed from: a */
    public final ErrorTypeKind f34415a;

    /* JADX INFO: renamed from: b */
    public final String[] f34416b;

    /* JADX INFO: renamed from: c */
    public final String f34417c;

    public C5601g(ErrorTypeKind errorTypeKind, String... strArr) {
        C5207g.m11111f(errorTypeKind, "kind");
        C5207g.m11111f(strArr, "formatParams");
        this.f34415a = errorTypeKind;
        this.f34416b = strArr;
        String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        String debugMessage = errorTypeKind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f34417c = C0166e.m770q(new Object[]{C0166e.m770q(objArrCopyOf, objArrCopyOf.length, debugMessage, "format(this, *args)")}, 1, debugText, "format(this, *args)");
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: o */
    public final AbstractC6795c mo11234o() {
        C6793a c6793a = C6793a.f38320f;
        return C6793a.f38320f;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: p */
    public final Collection<AbstractC5257t> mo11278p() {
        return EmptyList.f38032a;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: q */
    public final InterfaceC8834e mo11235q() {
        C5602h.f34418a.getClass();
        return C5602h.f34420c;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: r */
    public final List<InterfaceC8847k0> mo11260r() {
        return EmptyList.f38032a;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: s */
    public final boolean mo11261s() {
        return false;
    }

    public final String toString() {
        return this.f34417c;
    }
}
