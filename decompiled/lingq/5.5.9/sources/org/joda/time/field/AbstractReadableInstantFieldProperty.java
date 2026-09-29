package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import p163hp.AbstractC6094a;
import p163hp.AbstractC6095b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractReadableInstantFieldProperty implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    /* JADX INFO: renamed from: a */
    public final String m16087a(Locale locale) {
        return mo16038c().mo12574d(mo16039d(), locale);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public AbstractC6094a mo16037b() {
        throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC6095b mo16038c();

    /* JADX INFO: renamed from: d */
    public abstract long mo16039d();

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractReadableInstantFieldProperty)) {
            return false;
        }
        AbstractReadableInstantFieldProperty abstractReadableInstantFieldProperty = (AbstractReadableInstantFieldProperty) obj;
        if (mo16038c().mo12572b(mo16039d()) == abstractReadableInstantFieldProperty.mo16038c().mo12572b(abstractReadableInstantFieldProperty.mo16039d()) && mo16038c().mo12585w().equals(abstractReadableInstantFieldProperty.mo16038c().mo12585w())) {
            AbstractC6094a abstractC6094aMo16037b = mo16037b();
            AbstractC6094a abstractC6094aMo16037b2 = abstractReadableInstantFieldProperty.mo16037b();
            if (abstractC6094aMo16037b == abstractC6094aMo16037b2) {
                zEquals = true;
            } else {
                zEquals = (abstractC6094aMo16037b == null || abstractC6094aMo16037b2 == null) ? false : abstractC6094aMo16037b.equals(abstractC6094aMo16037b2);
            }
            if (zEquals) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return mo16037b().hashCode() + mo16038c().mo12585w().hashCode() + (mo16038c().mo12572b(mo16039d()) * 17);
    }

    public final String toString() {
        return "Property[" + mo16038c().mo12583s() + "]";
    }
}
