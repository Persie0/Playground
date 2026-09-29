package p000;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.feature.reader.shared.p018ui.components.ReaderProgressBar;
import com.lingq.p020ui.MainActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ew7 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37994a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f37995b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f37996c;

    public /* synthetic */ ew7(int i, Object obj, Object obj2) {
        this.f37994a = i;
        this.f37995b = obj;
        this.f37996c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String string;
        d7a d7aVar;
        sva binding;
        int i = this.f37994a;
        Object obj = this.f37996c;
        Object obj2 = this.f37995b;
        switch (i) {
            case 0:
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                ((ReaderFragment) obj2).m9290W0().mo8747U1();
                ReaderProgressBar readerProgressBar = ((we3) obj).f66708n;
                motionEvent.getClass();
                return readerProgressBar.onTouchEvent(motionEvent);
            default:
                b6a b6aVar = (b6a) obj2;
                v48 v48Var = (v48) obj;
                int action = motionEvent.getAction();
                if (action != 0 && action != 1) {
                    return false;
                }
                if (action != 1) {
                    return true;
                }
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                Rect rect = b6aVar.f8023b;
                if (x > rect.left && x < rect.right && y > rect.top && y < rect.bottom) {
                    MainActivity mainActivity = ((ro5) v48Var.f64848e).f59652a;
                    int i2 = MainActivity.f33994m0;
                    mainActivity.m9802q().mo8742L(b6aVar.m3373c().m24947b());
                    b6aVar.m3371a().mo0a();
                    return true;
                }
                TooltipStep tooltipStep = b6aVar.f8022a.f69328a;
                MainActivity mainActivity2 = (MainActivity) v48Var.f64845b;
                tooltipStep.getClass();
                if (w6a.f66459a[tooltipStep.ordinal()] == 2) {
                    string = mainActivity2.getString(R$string.tooltips_library_start_exit_tutorial);
                    string.getClass();
                } else {
                    string = "";
                }
                if (string.length() <= 0 || (d7aVar = (d7a) v48Var.f64854k) == null || (binding = d7aVar.getBinding()) == null) {
                    return true;
                }
                binding.f61500a.setText(string);
                return true;
        }
    }
}
