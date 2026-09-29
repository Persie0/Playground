package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.work.impl.WorkerStoppedException;
import com.google.common.util.concurrent.ListenableFuture;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.core.token.TokenPopupData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ue0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63804a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f63805b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f63806c;

    public /* synthetic */ ue0(int i, Object obj, Object obj2) {
        this.f63804a = i;
        this.f63806c = obj;
        this.f63805b = obj2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        String str;
        int i = this.f63804a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f63805b;
        Object obj3 = this.f63806c;
        switch (i) {
            case 0:
                return ((t70) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 1:
                return ((C3013ft) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 2:
                ((Challenge) obj).getClass();
                ((vi3) obj3).invoke(((qr0) obj2).f58098a);
                return xfaVar;
            case 3:
                return ((C3013ft) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 4:
                int iIntValue = ((Number) obj).intValue();
                return ((jx0) obj3).invoke(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            case 5:
                DictionaryData dictionaryData = (DictionaryData) obj;
                dictionaryData.getClass();
                f5a f5aVar = (f5a) obj3;
                TokenPopupData tokenPopupData = f5aVar.f38475g;
                if (tokenPopupData == null || (str = tokenPopupData.f23446b) == null) {
                    str = f5aVar.f38476h;
                }
                ((vi3) obj2).invoke(new z2a(new zf2(str, dictionaryData.m8023b(str), dictionaryData.m8022a(), dictionaryData.f19014g)));
                return xfaVar;
            case 6:
                return ((ae1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 7:
                return ((ae1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 8:
                return ((ae1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 9:
                return ((qy3) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 10:
                return ((qy3) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 11:
                return ((ry4) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 12:
                return ((ry4) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 13:
                return ((ry4) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 14:
                return ((ry4) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 15:
                return ((ry4) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 16:
                return ((lz5) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 17:
                return ((lz5) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 18:
                return ((qv7) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 19:
                int iIntValue2 = ((Number) obj).intValue();
                return ((cx7) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case 20:
                ((Boolean) obj).getClass();
                ((vi3) obj3).invoke(new su8((z29) obj2));
                return xfaVar;
            case 21:
                return ((qv7) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 22:
                return ((ow8) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return ((ow8) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 24:
                ((zi3) obj3).invoke((sxa) obj2, Integer.valueOf(((Number) obj).intValue()));
                return xfaVar;
            case 25:
                return ((e0b) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            default:
                Throwable th = (Throwable) obj;
                if (th instanceof WorkerStoppedException) {
                    ((pg5) obj3).f56133c.compareAndSet(-256, ((WorkerStoppedException) th).f7186a);
                }
                ((ListenableFuture) obj2).cancel(false);
                return xfaVar;
        }
    }
}
