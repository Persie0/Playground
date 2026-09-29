package org.joda.time.chrono;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.AbstractC8123f;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.chrono.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8109b extends AbstractC8123f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f44076d;

    /* JADX INFO: renamed from: e */
    public final BasicChronology f44077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8109b(BasicChronology basicChronology, AbstractC6097d abstractC6097d, int i10) {
        super(DateTimeFieldType.f43941f, abstractC6097d);
        this.f44076d = i10;
        if (i10 != 1) {
            this.f44077e = basicChronology;
        } else {
            super(DateTimeFieldType.f43947l, abstractC6097d);
            this.f44077e = basicChronology;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // org.joda.time.field.AbstractC8118a
    /* JADX INFO: renamed from: R */
    public final int mo16082R(String str, Locale locale) {
        switch (this.f44076d) {
            case 1:
                Integer num = C8114g.m16085b(locale).f44090h.get(str);
                if (num != null) {
                    return num.intValue();
                }
                throw new IllegalFieldValueException(DateTimeFieldType.f43947l, str);
            default:
                return super.mo16082R(str, locale);
        }
    }

    @Override // org.joda.time.field.AbstractC8118a
    /* JADX INFO: renamed from: T */
    public final int mo16081T(long j10, int i10) {
        switch (this.f44076d) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                this.f44077e.getClass();
                return (i10 > 365 || i10 < 1) ? mo12581q(j10) : 365;
            default:
                return mo12581q(j10);
        }
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: b */
    public final int mo12572b(long j10) {
        int i10 = this.f44076d;
        BasicChronology basicChronology = this.f44077e;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return ((int) ((j10 - basicChronology.m16054E0(basicChronology.m16053D0(j10))) / 86400000)) + 1;
            default:
                basicChronology.getClass();
                return BasicChronology.m16048q0(j10);
        }
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: c */
    public final String mo12573c(int i10, Locale locale) {
        switch (this.f44076d) {
            case 1:
                return C8114g.m16085b(locale).f44085c[i10];
            default:
                return mo12575e(i10, locale);
        }
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: e */
    public final String mo12575e(int i10, Locale locale) {
        switch (this.f44076d) {
            case 1:
                return C8114g.m16085b(locale).f44084b[i10];
            default:
                return Integer.toString(i10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: l */
    public final int mo12579l(Locale locale) {
        switch (this.f44076d) {
            case 1:
                return C8114g.m16085b(locale).f44093k;
            default:
                return super.mo12579l(locale);
        }
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        switch (this.f44076d) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                this.f44077e.getClass();
                return 366;
            default:
                return 7;
        }
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: q */
    public final int mo12581q(long j10) {
        switch (this.f44076d) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                BasicChronology basicChronology = this.f44077e;
                return basicChronology.mo16057H0(basicChronology.m16053D0(j10)) ? 366 : 365;
            default:
                return mo12580n();
        }
    }

    @Override // org.joda.time.field.AbstractC8123f, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final int mo12582r() {
        return 1;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: t */
    public final AbstractC6097d mo12584t() {
        int i10 = this.f44076d;
        BasicChronology basicChronology = this.f44077e;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return basicChronology.f44001j;
            default:
                return basicChronology.f43998g;
        }
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: x */
    public final boolean mo12586x(long j10) {
        switch (this.f44076d) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return this.f44077e.mo16056G0(j10);
            default:
                return false;
        }
    }
}
