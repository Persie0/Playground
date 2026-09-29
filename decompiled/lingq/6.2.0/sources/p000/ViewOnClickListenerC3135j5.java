package p000;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.p004ui.TrackSelectionView;
import com.google.common.collect.ImmutableList;
import com.lingq.core.achievements.RepairStreakFragment;
import com.lingq.feature.review.activities.ReviewActivityFlashcardFragment;
import com.lingq.feature.review.activities.ReviewActivityResultFragment;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: j5 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC3135j5 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45056a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45057b;

    public /* synthetic */ ViewOnClickListenerC3135j5(Object obj, int i) {
        this.f45056a = i;
        this.f45057b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i = this.f45056a;
        xfa xfaVar = xfa.f68157a;
        boolean z = false;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.f45057b;
        switch (i) {
            case 0:
                ((AbstractC0799b6) obj).mo3327a();
                break;
            case 1:
                C3792yd c3792yd = (C3792yd) obj;
                if (view == c3792yd.f69654i && (message3 = c3792yd.f69656k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == c3792yd.f69657l && (message2 = c3792yd.f69659n) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == c3792yd.f69660o && (message = c3792yd.f69662q) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c3792yd.f69644F.obtainMessage(1, c3792yd.f69647b).sendToTarget();
                break;
            case 2:
                rg0 rg0Var = (rg0) obj;
                if (rg0Var.f59226k && rg0Var.isShowing()) {
                    if (!rg0Var.f59217H) {
                        TypedArray typedArrayObtainStyledAttributes = rg0Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        rg0Var.f59227l = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        rg0Var.f59217H = true;
                    }
                    if (rg0Var.f59227l) {
                        rg0Var.cancel();
                    }
                    break;
                }
                break;
            case 3:
                RepairStreakFragment repairStreakFragment = (RepairStreakFragment) obj;
                id3 id3VarM2089Q = repairStreakFragment.m2089Q();
                b34.m3244j(repairStreakFragment);
                mbd.m16755c(id3VarM2089Q, "https://lingq.wixanswers.com/kb/en/article/how-to-earn-coins-and-what-to-do-with-them-6721550", null, 26);
                break;
            case 4:
                bh4[] bh4VarArr = ReviewActivityFlashcardFragment.f31913H0;
                ((ReviewActivityFlashcardFragment) obj).m9537S0().f32529y.mo4677k(xfaVar);
                break;
            case 5:
                bh4[] bh4VarArr2 = ReviewActivityResultFragment.f32067H0;
                ((ReviewActivityResultFragment) obj).m9546S0().f32530z.mo4677k(xfaVar);
                break;
            case 6:
                s5a s5aVar = ((Toolbar) obj).f1187j0;
                mw5 mw5Var = s5aVar != null ? s5aVar.f60391b : null;
                if (mw5Var != null) {
                    mw5Var.collapseActionView();
                }
                break;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                HashMap map = trackSelectionView.f6534g;
                if (view == trackSelectionView.f6530c) {
                    trackSelectionView.f6539l = true;
                    map.clear();
                } else if (view == trackSelectionView.f6531d) {
                    trackSelectionView.f6539l = false;
                    map.clear();
                } else {
                    trackSelectionView.f6539l = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    t8a t8aVar = (t8a) tag;
                    z8a z8aVar = t8aVar.f61990a;
                    j8a j8aVar = z8aVar.f71097b;
                    int i2 = t8aVar.f61991b;
                    p8a p8aVar = (p8a) map.get(j8aVar);
                    if (p8aVar == null) {
                        if (!trackSelectionView.f6536i && !map.isEmpty()) {
                            map.clear();
                        }
                        map.put(j8aVar, new p8a(j8aVar, ImmutableList.m6291y(Integer.valueOf(i2))));
                    } else {
                        ArrayList arrayList = new ArrayList(p8aVar.f55769b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        Object[] objArr = trackSelectionView.f6535h && z8aVar.f71098c;
                        if (objArr != false || (trackSelectionView.f6536i && trackSelectionView.f6533f.size() > 1)) {
                            z = true;
                        }
                        if (zIsChecked && z) {
                            arrayList.remove(Integer.valueOf(i2));
                            if (arrayList.isEmpty()) {
                                map.remove(j8aVar);
                            } else {
                                map.put(j8aVar, new p8a(j8aVar, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (objArr == true) {
                                arrayList.add(Integer.valueOf(i2));
                                map.put(j8aVar, new p8a(j8aVar, arrayList));
                            } else {
                                map.put(j8aVar, new p8a(j8aVar, ImmutableList.m6291y(Integer.valueOf(i2))));
                            }
                        }
                    }
                }
                trackSelectionView.m2571a();
                break;
        }
    }
}
