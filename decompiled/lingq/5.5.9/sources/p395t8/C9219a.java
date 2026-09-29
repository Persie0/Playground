package p395t8;

import com.google.android.datatransport.Priority;

/* JADX INFO: renamed from: t8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9219a<T> extends AbstractC9221c<T> {

    /* JADX INFO: renamed from: a */
    public final Integer f47833a = null;

    /* JADX INFO: renamed from: b */
    public final T f47834b;

    /* JADX INFO: renamed from: c */
    public final Priority f47835c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9219a(Object obj, Priority priority) {
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.f47834b = obj;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.f47835c = priority;
    }

    @Override // p395t8.AbstractC9221c
    /* JADX INFO: renamed from: a */
    public final Integer mo17579a() {
        return this.f47833a;
    }

    @Override // p395t8.AbstractC9221c
    /* JADX INFO: renamed from: b */
    public final T mo17580b() {
        return this.f47834b;
    }

    @Override // p395t8.AbstractC9221c
    /* JADX INFO: renamed from: c */
    public final Priority mo17581c() {
        return this.f47835c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9221c)) {
            return false;
        }
        AbstractC9221c abstractC9221c = (AbstractC9221c) obj;
        Integer num = this.f47833a;
        if (num != null ? num.equals(abstractC9221c.mo17579a()) : abstractC9221c.mo17579a() == null) {
            if (this.f47834b.equals(abstractC9221c.mo17580b()) && this.f47835c.equals(abstractC9221c.mo17581c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f47833a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f47834b.hashCode()) * 1000003) ^ this.f47835c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f47833a + ", payload=" + this.f47834b + ", priority=" + this.f47835c + "}";
    }
}
