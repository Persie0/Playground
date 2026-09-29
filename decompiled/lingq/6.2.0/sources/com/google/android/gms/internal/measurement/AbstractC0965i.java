package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.common.collect.C1097m;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC3393o1;
import p000.C3283l2;
import p000.bga;
import p000.cr2;
import p000.fmd;
import p000.gmd;
import p000.qld;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0965i implements gmd {

    /* JADX INFO: renamed from: a */
    public final AbstractC0965i f11860a;

    /* JADX INFO: renamed from: b */
    public final UUID f11861b;

    /* JADX INFO: renamed from: c */
    public final String f11862c;

    /* JADX INFO: renamed from: d */
    public final String f11863d;

    /* JADX INFO: renamed from: e */
    public Thread f11864e;

    public AbstractC0965i(String str, AbstractC0965i abstractC0965i, fmd fmdVar) {
        this.f11863d = str;
        this.f11860a = abstractC0965i;
        this.f11861b = abstractC0965i.f11861b;
        this.f11862c = abstractC0965i.f11862c;
        this.f11864e = Thread.currentThread();
    }

    /* JADX INFO: renamed from: a */
    public static String m5415a(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fmd fmdVarM20022c = qld.m20022c();
        gmd gmdVar = fmdVarM20022c.f39318b;
        String str = this.f11863d;
        if (gmdVar == null) {
            throw new zzvv(AbstractC3393o1.m17739n(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == gmdVar) {
            qld.m20021b(fmdVarM20022c, ((AbstractC0965i) gmdVar).f11860a);
            this.f11864e = null;
            return;
        }
        String str2 = ((AbstractC0965i) gmdVar).f11863d;
        StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
        AbstractC3393o1.m17725C(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb.append(".");
        throw new zzvw(sb.toString());
    }

    public final String toString() {
        AtomicReference atomicReference = qld.f57920a;
        AbstractC0965i abstractC0965i = this;
        int i = 0;
        int length = 0;
        while (abstractC0965i != null) {
            i++;
            length += abstractC0965i.f11863d.length();
            abstractC0965i = abstractC0965i.f11860a;
            if (abstractC0965i != null) {
                length += 4;
            }
        }
        if (i > 250) {
            String[] strArr = new String[i];
            AbstractC0965i abstractC0965i2 = this;
            for (int i2 = i - 1; i2 >= 0; i2--) {
                strArr[i2] = abstractC0965i2.f11863d;
                abstractC0965i2 = abstractC0965i2.f11860a;
            }
            C1097m c1097mM6295a = ImmutableMap.m6295a();
            bga it = ImmutableSet.m6309o(strArr).iterator();
            int i3 = 0;
            while (it.hasNext()) {
                c1097mM6295a.m6340b(it.next(), Integer.valueOf(i3));
                i3++;
            }
            ImmutableMap immutableMapM6339a = c1097mM6295a.m6339a(true);
            int i4 = i >> 2;
            C3283l2 c3283l2 = null;
            if (immutableMapM6339a.size() <= i4) {
                int[] iArr = new int[i + 1];
                for (int i5 = 0; i5 < i; i5++) {
                    iArr[i5] = ((Integer) immutableMapM6339a.get(strArr[i5])).intValue();
                }
                iArr[i] = immutableMapM6339a.size();
                C3283l2 c3283l2M9862f = cr2.m9857c(iArr).m9862f();
                if ((c3283l2M9862f.f48909b - c3283l2M9862f.f48908a) * c3283l2M9862f.f48910c >= i4) {
                    c3283l2 = c3283l2M9862f;
                }
            }
            String strConcat = "";
            if (c3283l2 != null) {
                int i6 = c3283l2.f48908a;
                String strConcat2 = i6 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i6))).concat(" -> ") : "";
                int i7 = c3283l2.f48909b;
                int i8 = c3283l2.f48910c;
                int i9 = ((i7 - i6) * i8) + i6;
                strConcat = i9 < i ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i9, i)))) : "";
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i6, i7));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i8 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        while (this != null) {
            String str = this.f11863d;
            length -= str.length();
            str.getChars(0, str.length(), cArr, length);
            this = this.f11860a;
            if (this != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    public AbstractC0965i(String str, UUID uuid, String str2, fmd fmdVar) {
        this.f11863d = str;
        this.f11860a = null;
        this.f11861b = uuid;
        this.f11862c = str2;
        fmdVar.getClass();
        this.f11864e = Thread.currentThread();
    }
}
