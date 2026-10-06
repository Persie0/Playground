package p000;

import android.hardware.camera2.CaptureRequest;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klm implements kpk {

    /* JADX INFO: renamed from: a */
    private final CaptureRequest f36478a;

    public klm(CaptureRequest captureRequest) {
        this.f36478a = captureRequest;
    }

    @Override // p000.kpk
    /* JADX INFO: renamed from: a */
    public final Object mo9512a(CaptureRequest.Key key) {
        return this.f36478a.get(key);
    }

    @Override // p000.kpk
    /* JADX INFO: renamed from: b */
    public final Object mo9513b() {
        return this.f36478a.getTag();
    }

    @Override // p000.kpk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return mpw.m16768g(this.f36478a, ((klm) obj).f36478a);
    }

    @Override // p000.kpk
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36478a});
    }

    @Override // p000.kpd
    /* JADX INFO: renamed from: j */
    public final khb mo7254j() {
        return new khb(this.f36478a);
    }

    public final String toString() {
        String string;
        ArrayList arrayList = new ArrayList();
        for (CaptureRequest.Key<?> key : this.f36478a.getKeys()) {
            String name = key.getName();
            Object objMo9512a = mo9512a(key);
            if (objMo9512a == null) {
                string = "null";
            } else if (objMo9512a.getClass().isArray()) {
                ArrayList arrayList2 = new ArrayList();
                int length = Array.getLength(objMo9512a);
                for (int i = 0; i < length; i++) {
                    arrayList2.add(Array.get(objMo9512a, i).toString());
                }
                string = lyz.m16212h(", ").m16215d(arrayList2);
            } else {
                string = objMo9512a.toString();
            }
            arrayList.add(name + " : " + string);
        }
        return lyz.m16212h("\n").m16215d(arrayList);
    }
}
