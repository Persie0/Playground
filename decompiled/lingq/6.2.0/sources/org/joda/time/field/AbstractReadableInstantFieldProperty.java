package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import p000.f12;
import p000.s11;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractReadableInstantFieldProperty implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    /* JADX INFO: renamed from: a */
    public final String m18446a(Locale locale) {
        return mo18376c().mo11033d(mo18377d(), locale);
    }

    /* JADX INFO: renamed from: b */
    public abstract s11 mo18375b();

    /* JADX INFO: renamed from: c */
    public abstract f12 mo18376c();

    /* JADX INFO: renamed from: d */
    public abstract long mo18377d();

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof AbstractReadableInstantFieldProperty) {
                AbstractReadableInstantFieldProperty abstractReadableInstantFieldProperty = (AbstractReadableInstantFieldProperty) obj;
                if (mo18376c().mo3734b(mo18377d()) == abstractReadableInstantFieldProperty.mo18376c().mo3734b(abstractReadableInstantFieldProperty.mo18377d()) && mo18376c().mo11491r().equals(abstractReadableInstantFieldProperty.mo18376c().mo11491r())) {
                    s11 s11VarMo18375b = mo18375b();
                    s11 s11VarMo18375b2 = abstractReadableInstantFieldProperty.mo18375b();
                    if (s11VarMo18375b == s11VarMo18375b2) {
                        zEquals = true;
                    } else {
                        zEquals = (s11VarMo18375b == null || s11VarMo18375b2 == null) ? false : s11VarMo18375b.equals(s11VarMo18375b2);
                    }
                    if (zEquals) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return mo18375b().hashCode() + mo18376c().mo11491r().hashCode() + (mo18376c().mo3734b(mo18377d()) * 17);
    }

    public final String toString() {
        return "Property[" + mo18376c().mo11490p() + "]";
    }
}
