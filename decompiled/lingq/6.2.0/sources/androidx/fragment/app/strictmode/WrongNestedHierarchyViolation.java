package androidx.fragment.app.strictmode;

import androidx.fragment.app.AbstractComponentCallbacksC0635c;

/* JADX INFO: loaded from: classes2.dex */
public final class WrongNestedHierarchyViolation extends Violation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongNestedHierarchyViolation(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2, int i) {
        super(abstractComponentCallbacksC0635c, "Attempting to nest fragment " + abstractComponentCallbacksC0635c + " within the view of parent fragment " + abstractComponentCallbacksC0635c2 + " via container with ID " + i + " without using parent's childFragmentManager");
        abstractComponentCallbacksC0635c.getClass();
    }
}
