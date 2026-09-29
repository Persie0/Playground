package dj;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.ToolTipsViewManager;
import dm.C5207g;
import kotlin.jvm.internal.Ref$BooleanRef;
import p183ik.C6343f;

/* JADX INFO: renamed from: dj.f */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnTouchListenerC5188f implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f33228b;

    public /* synthetic */ ViewOnTouchListenerC5188f(int i10, Object obj) {
        this.f33227a = i10;
        this.f33228b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f33227a;
        Object obj = this.f33228b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj;
                C5207g.m11111f(ref$BooleanRef, "$isSpinnerTouch");
                ref$BooleanRef.f38122a = true;
                break;
            default:
                ToolTipsViewManager toolTipsViewManager = (ToolTipsViewManager) obj;
                C5207g.m11111f(toolTipsViewManager, "this$0");
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                for (C6343f c6343f : toolTipsViewManager.f31917i) {
                    if (!c6343f.f36658e) {
                        Rect rect = c6343f.f36655b;
                        if (x10 > rect.left && x10 < rect.right && y10 > rect.top && y10 < rect.bottom) {
                            toolTipsViewManager.f31913e.mo9714a(c6343f);
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }
}
