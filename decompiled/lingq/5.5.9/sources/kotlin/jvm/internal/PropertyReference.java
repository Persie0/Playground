package kotlin.jvm.internal;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import km.InterfaceC6718a;
import km.InterfaceC6727j;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference extends CallableReference implements InterfaceC6727j {

    /* JADX INFO: renamed from: h */
    public final boolean f38121h;

    public PropertyReference() {
        this.f38121h = false;
    }

    public PropertyReference(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f38121h = (i10 & 2) == 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return mo13479d().equals(propertyReference.mo13479d()) && this.f38114d.equals(propertyReference.f38114d) && this.f38115e.equals(propertyReference.f38115e) && C5207g.m11106a(this.f38112b, propertyReference.f38112b);
        }
        if (obj instanceof InterfaceC6727j) {
            return obj.equals(m13481j());
        }
        return false;
    }

    public final int hashCode() {
        return this.f38115e.hashCode() + C0166e.m758d(this.f38114d, mo13479d().hashCode() * 31, 31);
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC6718a m13481j() {
        if (this.f38121h) {
            return this;
        }
        InterfaceC6718a interfaceC6718aMo13478c = this.f38111a;
        if (interfaceC6718aMo13478c == null) {
            interfaceC6718aMo13478c = mo13478c();
            this.f38111a = interfaceC6718aMo13478c;
        }
        return interfaceC6718aMo13478c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final InterfaceC6727j m13482k() {
        if (this.f38121h) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        InterfaceC6718a interfaceC6718aM13481j = m13481j();
        if (interfaceC6718aM13481j != this) {
            return (InterfaceC6727j) interfaceC6718aM13481j;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public final String toString() {
        InterfaceC6718a interfaceC6718aM13481j = m13481j();
        return interfaceC6718aM13481j != this ? interfaceC6718aM13481j.toString() : C0009a.m23l(new StringBuilder("property "), this.f38114d, " (Kotlin reflection is not available)");
    }
}
