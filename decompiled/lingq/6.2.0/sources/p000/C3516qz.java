package p000;

import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.material3.AbstractC0266w;
import androidx.compose.material3.C0253l;
import androidx.compose.material3.DrawerValue;
import androidx.compose.p002ui.focus.FocusStateImpl;
import androidx.compose.p002ui.layout.AbstractC0343j;
import com.lingq.feature.edit.components.AbstractC2078a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: renamed from: qz */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3516qz implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58397a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f58398b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f58399c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f58400d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f58401e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f58402f;

    public /* synthetic */ C3516qz(ui3 ui3Var, int i, vi3 vi3Var, t66 t66Var, qc9 qc9Var) {
        this.f58397a = 1;
        this.f58401e = ui3Var;
        this.f58398b = i;
        this.f58399c = vi3Var;
        this.f58400d = t66Var;
        this.f58402f = qc9Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Integer numM4844a0;
        Object value;
        int i = this.f58397a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f58398b;
        Object obj2 = this.f58402f;
        Object obj3 = this.f58400d;
        Object obj4 = this.f58401e;
        Object obj5 = this.f58399c;
        switch (i) {
            case 0:
                vi3 vi3Var = (vi3) obj5;
                String str = (String) obj4;
                t66 t66Var = (t66) obj3;
                t66 t66Var2 = (t66) obj2;
                FocusStateImpl focusStateImpl = (FocusStateImpl) obj;
                focusStateImpl.getClass();
                boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
                t66Var.setValue(Boolean.valueOf(focusStateImpl.isFocused()));
                if (zBooleanValue && !focusStateImpl.isFocused()) {
                    String str2 = ((vv9) t66Var2.getValue()).f65990a.f54604b;
                    if (AbstractC2078a.f25963a.m15427f(str2)) {
                        numM4844a0 = Integer.valueOf((Integer.parseInt(str2.substring(6, 7)) * 10) + (Integer.parseInt(str2.substring(3, 5)) * 100) + (Integer.parseInt(str2.substring(0, 2)) * 6000));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int length = str2.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            char cCharAt = str2.charAt(i3);
                            if (Character.isDigit(cCharAt)) {
                                sb.append(cCharAt);
                            }
                        }
                        numM4844a0 = cl9.m4844a0(sb.toString());
                    }
                    if (numM4844a0 != null) {
                        vi3Var.invoke(new d15(numM4844a0.intValue(), i2));
                    }
                    t66Var2.setValue(new vv9(str, 6, 0L));
                }
                break;
            case 1:
                ui3 ui3Var = (ui3) obj4;
                vi3 vi3Var2 = (vi3) obj5;
                t66 t66Var3 = (t66) obj3;
                qc9 qc9Var = (qc9) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                if (!((Boolean) t66Var3.getValue()).booleanValue()) {
                    t66Var3.setValue(Boolean.TRUE);
                    ui3Var.mo0a();
                }
                qc9Var.m19862i(l70.m15944g(fFloatValue, 0.0f, i2));
                vi3Var2.invoke(Integer.valueOf(l70.m15945h(ss5.m21693T(qc9Var.m19861h()), 0, i2) + 1));
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj4;
                t66 t66Var4 = (t66) obj3;
                qc9 qc9Var2 = (qc9) obj2;
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                C0097e c0097e = ((C0253l) obj5).f3552b;
                a62 a62VarM849c = c0097e.m849c();
                gc2 gc2Var = c0097e.f2240i;
                qc9 qc9Var3 = c0097e.f2241j;
                DrawerValue drawerValue = DrawerValue.Closed;
                float fM133f = a62VarM849c.m133f(drawerValue);
                float f = -i2;
                fda fdaVar = AbstractC0266w.f3635a;
                if (!((Boolean) t66Var4.getValue()).booleanValue() || fM133f != f) {
                    if (!((Boolean) t66Var4.getValue()).booleanValue()) {
                        t66Var4.setValue(Boolean.TRUE);
                    }
                    qc9Var2.m19862i(f);
                    bl2 bl2Var = new bl2(0);
                    bl2Var.m3857n(drawerValue, qc9Var2.m19861h());
                    bl2Var.m3857n(DrawerValue.Open, 0.0f);
                    ArrayList arrayList2 = (ArrayList) bl2Var.f8655a;
                    float[] fArr = (float[]) bl2Var.f8656b;
                    int size = arrayList2.size();
                    fArr.getClass();
                    AbstractC3184kh.m15215i(size, fArr.length);
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                    fArrCopyOfRange.getClass();
                    a62 a62Var = new a62(arrayList2, fArrCopyOfRange);
                    if (Float.isNaN(qc9Var3.m19861h()) || (value = a62Var.m128a(qc9Var3.m19861h())) == null) {
                        value = gc2Var.getValue();
                    }
                    c0097e.m854h(a62Var, value);
                }
                float fM19861h = qc9Var2.m19861h();
                if (l70.m15944g((c0097e.m852f() - fM19861h) / (0.0f - fM19861h), 0.0f, 1.0f) != 0.0f) {
                    int size2 = arrayList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        AbstractC0343j.m1521j(abstractC0343j, (l87) arrayList.get(i4), 0, 0);
                    }
                }
                break;
            default:
                ArrayList arrayList3 = (ArrayList) obj5;
                ArrayList arrayList4 = (ArrayList) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                AbstractC0343j abstractC0343j2 = (AbstractC0343j) obj;
                int size3 = arrayList3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    AbstractC0343j.m1521j(abstractC0343j2, (l87) arrayList3.get(i5), ref$IntRef.f47716a * i5, 0);
                }
                int size4 = arrayList4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    l87 l87Var = (l87) arrayList4.get(i6);
                    AbstractC0343j.m1521j(abstractC0343j2, l87Var, 0, i2 - l87Var.f49302b);
                }
                int size5 = arrayList5.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    l87 l87Var2 = (l87) arrayList5.get(i7);
                    AbstractC0343j.m1521j(abstractC0343j2, l87Var2, 0, i2 - l87Var2.f49302b);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3516qz(Object obj, int i, Serializable serializable, t66 t66Var, t66 t66Var2, int i2) {
        this.f58397a = i2;
        this.f58399c = obj;
        this.f58398b = i;
        this.f58401e = serializable;
        this.f58400d = t66Var;
        this.f58402f = t66Var2;
    }

    public /* synthetic */ C3516qz(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Ref$IntRef ref$IntRef, int i) {
        this.f58397a = 3;
        this.f58399c = arrayList;
        this.f58401e = arrayList2;
        this.f58400d = arrayList3;
        this.f58402f = ref$IntRef;
        this.f58398b = i;
    }
}
