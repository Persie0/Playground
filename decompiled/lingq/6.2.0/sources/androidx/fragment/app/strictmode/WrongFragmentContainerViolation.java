package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;

/* JADX INFO: loaded from: classes2.dex */
public final class WrongFragmentContainerViolation extends Violation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, ViewGroup viewGroup) {
        super(abstractComponentCallbacksC0635c, "Attempting to add fragment " + abstractComponentCallbacksC0635c + " to container " + viewGroup + " which is not a FragmentContainerView");
        abstractComponentCallbacksC0635c.getClass();
    }
}
