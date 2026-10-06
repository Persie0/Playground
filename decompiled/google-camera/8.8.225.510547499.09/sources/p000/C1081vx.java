package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: vx */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1081vx {
    static {
        omn.m18683W(new Integer[]{2, 4, 3});
        omn.m18683W(new Integer[]{2, 3});
        omn.m18683W(new Integer[]{2, 6, 4, 5});
        omn.m18666F(3);
        omn.m18666F(3);
        omn.m18683W(new Integer[]{4, 5});
        omn.m18683W(new Integer[]{2, 4, 3});
        omn.m18661A(lkm.m15590q(CaptureRequest.CONTROL_AF_TRIGGER, 1));
        omn.m18661A(lkm.m15590q(CaptureRequest.CONTROL_AF_TRIGGER, 2));
        okb[] okbVarArr = {lkm.m15590q(CaptureRequest.CONTROL_AF_TRIGGER, 1), lkm.m15590q(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(omn.m18721z(2));
        for (int i = 0; i < 2; i++) {
            okb okbVar = okbVarArr[i];
            linkedHashMap.put(okbVar.f46186a, okbVar.f46187b);
        }
        omn.m18683W(new Integer[]{0, 1, 2, 4});
        omn.m18683W(new Integer[]{0, 3, 1, 2, 6});
        omn.m18683W(new Integer[]{0, 1, 2});
    }
}
