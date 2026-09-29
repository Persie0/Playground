package androidx.compose.p002ui.layout;

import p000.AbstractC3584sr;
import p000.h28;
import p000.kv3;
import p000.x74;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.layout.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0336c implements h28 {

    /* JADX INFO: renamed from: a */
    public final h28[] f4182a;

    /* JADX INFO: renamed from: b */
    public final kv3 f4183b;

    /* JADX INFO: renamed from: c */
    public final kv3 f4184c;

    /* JADX INFO: renamed from: d */
    public final kv3 f4185d;

    /* JADX INFO: renamed from: e */
    public final kv3 f4186e;

    public C0336c(h28[] h28VarArr) {
        this.f4182a = h28VarArr;
        int length = h28VarArr.length;
        final kv3[] kv3VarArr = new kv3[length];
        for (int i = 0; i < length; i++) {
            kv3VarArr[i] = this.f4182a[i].mo1483b();
        }
        this.f4183b = new kv3(1, new zi3() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(AbstractC3584sr.m21639q((AbstractC0343j) obj, true, kv3VarArr, ((Number) obj2).floatValue()));
            }
        });
        int length2 = this.f4182a.length;
        final kv3[] kv3VarArr2 = new kv3[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            kv3VarArr2[i2] = this.f4182a[i2].mo1484c();
        }
        this.f4184c = new kv3(0, new zi3() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(AbstractC3584sr.m21639q((AbstractC0343j) obj, true, kv3VarArr2, ((Number) obj2).floatValue()));
            }
        });
        int length3 = this.f4182a.length;
        final kv3[] kv3VarArr3 = new kv3[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            kv3VarArr3[i3] = this.f4182a[i3].mo1485d();
        }
        this.f4185d = new kv3(1, new zi3() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$minOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(AbstractC3584sr.m21639q((AbstractC0343j) obj, false, kv3VarArr3, ((Number) obj2).floatValue()));
            }
        });
        int length4 = this.f4182a.length;
        final kv3[] kv3VarArr4 = new kv3[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            kv3VarArr4[i4] = this.f4182a[i4].mo1482a();
        }
        this.f4186e = new kv3(0, new zi3() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$minOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(AbstractC3584sr.m21639q((AbstractC0343j) obj, false, kv3VarArr4, ((Number) obj2).floatValue()));
            }
        });
    }

    @Override // p000.h28
    /* JADX INFO: renamed from: a */
    public final kv3 mo1482a() {
        return this.f4186e;
    }

    @Override // p000.h28
    /* JADX INFO: renamed from: b */
    public final kv3 mo1483b() {
        return this.f4183b;
    }

    @Override // p000.h28
    /* JADX INFO: renamed from: c */
    public final kv3 mo1484c() {
        return this.f4184c;
    }

    @Override // p000.h28
    /* JADX INFO: renamed from: d */
    public final kv3 mo1485d() {
        return this.f4185d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "innermostOf(");
        int i = 0;
        for (h28 h28Var : this.f4182a) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            x74.m24349f(sb, h28Var, null);
        }
        sb.append((CharSequence) ")");
        return sb.toString();
    }
}
