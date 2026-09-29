package androidx.compose.foundation.text.selection;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.runtime.AbstractC0278f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C3248a;
import p000.C3386nv;
import p000.c76;
import p000.cx9;
import p000.e97;
import p000.fa4;
import p000.kn1;
import p000.t66;
import p000.ti5;
import p000.v91;
import p000.vh9;
import p000.xc9;
import p000.xfa;
import p000.xi5;
import p000.ys9;
import p000.z87;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0200a {

    /* JADX INFO: renamed from: a */
    public final kn1 f3061a;

    /* JADX INFO: renamed from: b */
    public final Context f3062b;

    /* JADX INFO: renamed from: c */
    public final SelectedTextType f3063c;

    /* JADX INFO: renamed from: d */
    public final xi5 f3064d;

    /* JADX INFO: renamed from: f */
    public TextClassifier f3066f;

    /* JADX INFO: renamed from: e */
    public final C3248a f3065e = new C3248a();

    /* JADX INFO: renamed from: g */
    public final t66 f3067g = AbstractC0278f.m1260j(null);

    /* JADX INFO: renamed from: h */
    public final Object f3068h = new Object();

    public C0200a(kn1 kn1Var, Context context, SelectedTextType selectedTextType, xi5 xi5Var) {
        this.f3061a = kn1Var;
        this.f3062b = context;
        this.f3063c = selectedTextType;
        this.f3064d = xi5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        if (r1 == r5) goto L36;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1092a(C0200a c0200a, CharSequence charSequence, long j, TextClassifier textClassifier, ContinuationImpl continuationImpl) throws Throwable {
        PlatformSelectionBehaviorsImpl$classifyText$1 platformSelectionBehaviorsImpl$classifyText$1;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        C3248a c3248a;
        ys9 ys9VarM1093b;
        c76 c76Var;
        C3248a c3248a2 = c0200a.f3065e;
        t66 t66Var = c0200a.f3067g;
        if (continuationImpl instanceof PlatformSelectionBehaviorsImpl$classifyText$1) {
            platformSelectionBehaviorsImpl$classifyText$1 = (PlatformSelectionBehaviorsImpl$classifyText$1) continuationImpl;
            int i = platformSelectionBehaviorsImpl$classifyText$1.f2972g;
            if ((i & Integer.MIN_VALUE) != 0) {
                platformSelectionBehaviorsImpl$classifyText$1.f2972g = i - Integer.MIN_VALUE;
            } else {
                platformSelectionBehaviorsImpl$classifyText$1 = new PlatformSelectionBehaviorsImpl$classifyText$1(c0200a, continuationImpl);
            }
        } else {
            platformSelectionBehaviorsImpl$classifyText$1 = new PlatformSelectionBehaviorsImpl$classifyText$1(c0200a, continuationImpl);
        }
        Object obj = platformSelectionBehaviorsImpl$classifyText$1.f2970e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = platformSelectionBehaviorsImpl$classifyText$1.f2972g;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                platformSelectionBehaviorsImpl$classifyText$1.f2966a = charSequence;
                platformSelectionBehaviorsImpl$classifyText$1.f2967b = textClassifier;
                platformSelectionBehaviorsImpl$classifyText$1.f2968c = c3248a2;
                j2 = j;
                platformSelectionBehaviorsImpl$classifyText$1.f2969d = j2;
                platformSelectionBehaviorsImpl$classifyText$1.f2972g = 1;
                if (c3248a2.mo4388c(platformSelectionBehaviorsImpl$classifyText$1) != coroutineSingletons) {
                    charSequence2 = charSequence;
                    textClassifier2 = textClassifier;
                    c3248a = c3248a2;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                j2 = platformSelectionBehaviorsImpl$classifyText$1.f2969d;
                C3248a c3248a3 = platformSelectionBehaviorsImpl$classifyText$1.f2968c;
                textClassifier2 = (TextClassifier) platformSelectionBehaviorsImpl$classifyText$1.f2967b;
                charSequence2 = (CharSequence) platformSelectionBehaviorsImpl$classifyText$1.f2966a;
                AbstractC3193b.m15359b(obj);
                c3248a = c3248a3;
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c76 c76Var2 = (c76) platformSelectionBehaviorsImpl$classifyText$1.f2967b;
                ys9VarM1093b = (ys9) platformSelectionBehaviorsImpl$classifyText$1.f2966a;
                AbstractC3193b.m15359b(obj);
                c76Var = c76Var2;
            }
            try {
                ((xc9) t66Var).setValue(ys9VarM1093b);
                return xfaVar;
            } finally {
                c76Var.mo4387b(null);
            }
            ys9 ys9Var = (ys9) ((xc9) t66Var).getValue();
            if (ys9Var != null) {
                vh9 vh9Var = e97.f36884a;
                if (cx9.m9920b(j2, ys9Var.f70428b) && fa4.m11650l(charSequence2, ys9Var.f70427a)) {
                    c3248a.mo4387b(null);
                    return xfaVar;
                }
            }
            c3248a.mo4387b(null);
            ys9VarM1093b = c0200a.m1093b(charSequence2, j2, textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, cx9.m9924f(j2), cx9.m9923e(j2)).setDefaultLocales(c0200a.m1094c()).build()));
            platformSelectionBehaviorsImpl$classifyText$1.f2966a = ys9VarM1093b;
            platformSelectionBehaviorsImpl$classifyText$1.f2967b = c3248a2;
            platformSelectionBehaviorsImpl$classifyText$1.f2968c = null;
            platformSelectionBehaviorsImpl$classifyText$1.f2972g = 2;
            Object objMo4388c = c3248a2.mo4388c(platformSelectionBehaviorsImpl$classifyText$1);
            c76Var = c3248a2;
        } catch (Throwable th) {
            c3248a.mo4387b(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final ys9 m1093b(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            RemoteAction remoteAction2 = remoteAction;
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteAction2.shouldShowIcon()) {
                remoteAction = null;
            }
            RemoteAction remoteAction3 = remoteAction;
            if (remoteAction3 != null && (icon = remoteAction3.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.f3062b);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new ys9(charSequence, j, textClassification, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public final LocaleList m1094c() {
        xi5 xi5Var = this.f3064d;
        if (xi5Var == null) {
            return new LocaleList(((ti5) z87.f71091a.m16516s().f68251a.get(0)).f62341a);
        }
        ArrayList arrayList = new ArrayList(v91.m23189q0(xi5Var, 10));
        Iterator it = xi5Var.f68251a.iterator();
        while (it.hasNext()) {
            arrayList.add(((ti5) it.next()).f62341a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
