package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.state.ToggleableState;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import p000.C3024g3;
import p000.bh4;
import p000.o39;
import p000.ru4;
import p000.tm7;
import p000.tv8;
import p000.uh8;
import p000.vi3;
import p000.vz1;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0426f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ bh4[] f5022a = {new MutablePropertyReference1Impl(AbstractC0426f.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), new MutablePropertyReference1Impl(AbstractC0426f.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        C0427g c0427g = AbstractC0424d.f4994a;
        C0427g c0427g2 = AbstractC0421a.f4945a;
    }

    /* JADX INFO: renamed from: a */
    public static void m1857a(tv8 tv8Var, final ru4 ru4Var) {
        tv8Var.mo3709d(AbstractC0421a.f4944C, new C3024g3(null, new vi3() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$getScrollViewportLength$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ((List) obj).add((Float) ru4Var.mo0a());
                return true;
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static void m1858b(tv8 tv8Var, vi3 vi3Var) {
        tv8Var.mo3709d(AbstractC0421a.f4945a, new C3024g3(null, vi3Var));
    }

    /* JADX INFO: renamed from: c */
    public static void m1859c(tv8 tv8Var, vi3 vi3Var) {
        tv8Var.mo3709d(AbstractC0421a.f4952h, new C3024g3(null, vi3Var));
    }

    /* JADX INFO: renamed from: d */
    public static final void m1860d(tv8 tv8Var, String str) {
        C0427g c0427g = AbstractC0424d.f4994a;
        tv8Var.mo3709d(AbstractC0424d.f4994a, vz1.m23604J(str));
    }

    /* JADX INFO: renamed from: e */
    public static final void m1861e(tv8 tv8Var, String str) {
        C0427g c0427g = AbstractC0424d.f4994a;
        C0427g c0427g2 = AbstractC0424d.f4997d;
        bh4 bh4Var = f5022a[2];
        tv8Var.mo3709d(c0427g2, str);
    }

    /* JADX INFO: renamed from: f */
    public static void m1862f(tv8 tv8Var, vi3 vi3Var) {
        tv8Var.mo3709d(AbstractC0421a.f4953i, new C3024g3(null, vi3Var));
    }

    /* JADX INFO: renamed from: g */
    public static final void m1863g(tv8 tv8Var, tm7 tm7Var) {
        C0427g c0427g = AbstractC0424d.f4994a;
        C0427g c0427g2 = AbstractC0424d.f4996c;
        bh4 bh4Var = f5022a[1];
        tv8Var.mo3709d(c0427g2, tm7Var);
    }

    /* JADX INFO: renamed from: h */
    public static final void m1864h(tv8 tv8Var, int i) {
        C0427g c0427g = AbstractC0424d.f5019z;
        bh4 bh4Var = f5022a[14];
        tv8Var.mo3709d(c0427g, new uh8(i));
    }

    /* JADX INFO: renamed from: i */
    public static final void m1865i(tv8 tv8Var, o39 o39Var) {
        C0427g c0427g = AbstractC0424d.f4994a;
        C0427g c0427g2 = AbstractC0424d.f4993Q;
        bh4 bh4Var = f5022a[30];
        tv8Var.mo3709d(c0427g2, o39Var);
    }

    /* JADX INFO: renamed from: j */
    public static final void m1866j(tv8 tv8Var, ToggleableState toggleableState) {
        C0427g c0427g = AbstractC0424d.f4994a;
        C0427g c0427g2 = AbstractC0424d.f4987K;
        bh4 bh4Var = f5022a[26];
        tv8Var.mo3709d(c0427g2, toggleableState);
    }

    /* JADX INFO: renamed from: k */
    public static final void m1867k(tv8 tv8Var) {
        C0427g c0427g = AbstractC0424d.f5007n;
        bh4 bh4Var = f5022a[6];
        tv8Var.mo3709d(c0427g, Boolean.TRUE);
    }
}
