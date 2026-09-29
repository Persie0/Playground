package com.lingq.core.settings.domain;

import android.content.SharedPreferences;
import com.lingq.core.data.profile.C1267a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.user.ProfileSettings;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.C3509qs;
import p000.e7a;
import p000.km7;
import p000.nm7;
import p000.si7;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.settings.domain.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1865d {

    /* JADX INFO: renamed from: a */
    public final C3509qs f22931a;

    /* JADX INFO: renamed from: b */
    public final si7 f22932b;

    /* JADX INFO: renamed from: c */
    public final km7 f22933c;

    /* JADX INFO: renamed from: d */
    public final nm7 f22934d;

    /* JADX INFO: renamed from: e */
    public final e7a f22935e;

    public C1865d(C3509qs c3509qs, si7 si7Var, km7 km7Var, nm7 nm7Var, e7a e7aVar) {
        c3509qs.getClass();
        si7Var.getClass();
        km7Var.getClass();
        nm7Var.getClass();
        e7aVar.getClass();
        this.f22931a = c3509qs;
        this.f22932b = si7Var;
        this.f22933c = km7Var;
        this.f22934d = nm7Var;
        this.f22935e = e7aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0109, code lost:
    
        if (((com.lingq.core.datastore.C1369b) r70.f22934d).m7925l(false, r2) == r3) goto L26;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8626a(ContinuationImpl continuationImpl) throws Throwable {
        ResetTutorialUseCase$invoke$1 resetTutorialUseCase$invoke$1;
        if (continuationImpl instanceof ResetTutorialUseCase$invoke$1) {
            resetTutorialUseCase$invoke$1 = (ResetTutorialUseCase$invoke$1) continuationImpl;
            int i = resetTutorialUseCase$invoke$1.f22795c;
            if ((i & Integer.MIN_VALUE) != 0) {
                resetTutorialUseCase$invoke$1.f22795c = i - Integer.MIN_VALUE;
            } else {
                resetTutorialUseCase$invoke$1 = new ResetTutorialUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            resetTutorialUseCase$invoke$1 = new ResetTutorialUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = resetTutorialUseCase$invoke$1.f22793a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = resetTutorialUseCase$invoke$1.f22795c;
        xfa xfaVar = xfa.f68157a;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3193b.m15359b(obj);
            } else if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                resetTutorialUseCase$invoke$1.f22795c = 3;
            } else {
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            this.f22935e.mo8777t0();
            return xfaVar;
        }
        AbstractC3193b.m15359b(obj);
        C3509qs c3509qs = this.f22931a;
        c3509qs.m20136j(0);
        SharedPreferences sharedPreferences = c3509qs.f58118b;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putBoolean("pagingDealWithWords", false);
        editorEdit.apply();
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.getClass();
        editorEdit2.putBoolean("pagingMoveToKnown", false);
        editorEdit2.apply();
        resetTutorialUseCase$invoke$1.f22795c = 1;
        if (((C1368a) this.f22932b).m7852K(false, resetTutorialUseCase$invoke$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
        ProfileSettings profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, 16777215);
        resetTutorialUseCase$invoke$1.f22795c = 2;
        ((C1267a) this.f22933c).m7061B(profileSettings);
        if (xfaVar != coroutineSingletons) {
            resetTutorialUseCase$invoke$1.f22795c = 3;
        }
        return coroutineSingletons;
    }
}
