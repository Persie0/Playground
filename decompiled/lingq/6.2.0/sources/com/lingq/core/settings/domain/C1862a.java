package com.lingq.core.settings.domain;

import com.lingq.core.data.profile.C1267a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.server.ServerEnvironment;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.ProfileSetting;
import com.lingq.core.domain.model.user.ProfileSettingType;
import com.lingq.core.settings.ViewKeys;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.dp9;
import p000.km7;
import p000.nm7;
import p000.qm7;
import p000.si7;
import p000.u91;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.settings.domain.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1862a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22917a;

    /* JADX INFO: renamed from: b */
    public final Object f22918b;

    /* JADX INFO: renamed from: c */
    public final Object f22919c;

    public C1862a(km7 km7Var, nm7 nm7Var, int i) {
        this.f22917a = i;
        km7Var.getClass();
        nm7Var.getClass();
        switch (i) {
            case 1:
                this.f22918b = km7Var;
                this.f22919c = nm7Var;
                break;
            case 2:
                this.f22918b = km7Var;
                this.f22919c = nm7Var;
                break;
            default:
                this.f22918b = km7Var;
                this.f22919c = nm7Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r5.m8625a(r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8615a(ServerEnvironment serverEnvironment, ContinuationImpl continuationImpl) throws Throwable {
        SwitchServerUseCase$invoke$1 switchServerUseCase$invoke$1;
        if (continuationImpl instanceof SwitchServerUseCase$invoke$1) {
            switchServerUseCase$invoke$1 = (SwitchServerUseCase$invoke$1) continuationImpl;
            int i = switchServerUseCase$invoke$1.f22862c;
            if ((i & Integer.MIN_VALUE) != 0) {
                switchServerUseCase$invoke$1.f22862c = i - Integer.MIN_VALUE;
            } else {
                switchServerUseCase$invoke$1 = new SwitchServerUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            switchServerUseCase$invoke$1 = new SwitchServerUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = switchServerUseCase$invoke$1.f22860a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = switchServerUseCase$invoke$1.f22862c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            si7 si7Var = (si7) this.f22918b;
            switchServerUseCase$invoke$1.f22862c = 1;
            if (((C1368a) si7Var).m7864W(serverEnvironment, switchServerUseCase$invoke$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        C1864c c1864c = (C1864c) this.f22919c;
        switchServerUseCase$invoke$1.f22862c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m8616b(ViewKeys viewKeys, ProfileSettingType profileSettingType, ContinuationImpl continuationImpl) throws Throwable {
        SyncProfileSettingUseCase$invoke$1 syncProfileSettingUseCase$invoke$1;
        if (continuationImpl instanceof SyncProfileSettingUseCase$invoke$1) {
            syncProfileSettingUseCase$invoke$1 = (SyncProfileSettingUseCase$invoke$1) continuationImpl;
            int i = syncProfileSettingUseCase$invoke$1.f22872e;
            if ((i & Integer.MIN_VALUE) != 0) {
                syncProfileSettingUseCase$invoke$1.f22872e = i - Integer.MIN_VALUE;
            } else {
                syncProfileSettingUseCase$invoke$1 = new SyncProfileSettingUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            syncProfileSettingUseCase$invoke$1 = new SyncProfileSettingUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = syncProfileSettingUseCase$invoke$1.f22870c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = syncProfileSettingUseCase$invoke$1.f22872e;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            qm7 qm7Var = ((C1369b) ((nm7) this.f22919c)).f18480m;
            syncProfileSettingUseCase$invoke$1.f22868a = viewKeys;
            syncProfileSettingUseCase$invoke$1.f22869b = profileSettingType;
            syncProfileSettingUseCase$invoke$1.f22872e = 1;
            objM15541t = AbstractC3224d.m15541t(qm7Var, syncProfileSettingUseCase$invoke$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        profileSettingType = syncProfileSettingUseCase$invoke$1.f22869b;
        viewKeys = syncProfileSettingUseCase$invoke$1.f22868a;
        AbstractC3193b.m15359b(objM15541t);
        Profile profile = (Profile) objM15541t;
        ProfileSetting profileSetting = new ProfileSetting();
        switch (dp9.f36009a[viewKeys.ordinal()]) {
            case 1:
                profileSetting.f19691a = profileSettingType;
                break;
            case 2:
                profileSetting.f19692b = profileSettingType;
                break;
            case 3:
                profileSetting.f19693c = profileSettingType;
                break;
            case 4:
                profileSetting.f19695e = profileSettingType;
                break;
            case 5:
                profileSetting.f19694d = profileSettingType;
                break;
            case 6:
                profileSetting.f19696f = profileSettingType;
                break;
            case 7:
                profileSetting.f19698h = profileSettingType;
                break;
            case 8:
                profileSetting.f19697g = profileSettingType;
                break;
            default:
                return xfaVar;
        }
        km7 km7Var = (km7) this.f22918b;
        int i3 = profile.f19652a;
        syncProfileSettingUseCase$invoke$1.f22868a = null;
        syncProfileSettingUseCase$invoke$1.f22869b = null;
        syncProfileSettingUseCase$invoke$1.f22872e = 2;
        if (((C1267a) km7Var).m7091u(i3, profileSetting, syncProfileSettingUseCase$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /* JADX INFO: renamed from: c */
    public Object m8617c(String str, ContinuationImpl continuationImpl) throws Throwable {
        AddDictionaryLanguageUseCase$invoke$1 addDictionaryLanguageUseCase$invoke$1;
        RemoveDictionaryLanguageUseCase$invoke$1 removeDictionaryLanguageUseCase$invoke$1;
        int i = this.f22917a;
        Object obj = this.f22918b;
        Object obj2 = this.f22919c;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                if (continuationImpl instanceof AddDictionaryLanguageUseCase$invoke$1) {
                    addDictionaryLanguageUseCase$invoke$1 = (AddDictionaryLanguageUseCase$invoke$1) continuationImpl;
                    int i2 = addDictionaryLanguageUseCase$invoke$1.f22755d;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        addDictionaryLanguageUseCase$invoke$1.f22755d = i2 - Integer.MIN_VALUE;
                    } else {
                        addDictionaryLanguageUseCase$invoke$1 = new AddDictionaryLanguageUseCase$invoke$1(this, continuationImpl);
                    }
                } else {
                    addDictionaryLanguageUseCase$invoke$1 = new AddDictionaryLanguageUseCase$invoke$1(this, continuationImpl);
                }
                Object objM15541t = addDictionaryLanguageUseCase$invoke$1.f22753b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = addDictionaryLanguageUseCase$invoke$1.f22755d;
                if (i3 == 0) {
                    AbstractC3193b.m15359b(objM15541t);
                    qm7 qm7Var = ((C1369b) ((nm7) obj2)).f18480m;
                    addDictionaryLanguageUseCase$invoke$1.f22752a = str;
                    addDictionaryLanguageUseCase$invoke$1.f22755d = 1;
                    objM15541t = AbstractC3224d.m15541t(qm7Var, addDictionaryLanguageUseCase$invoke$1);
                    if (objM15541t != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        AbstractC3193b.m15359b(objM15541t);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = addDictionaryLanguageUseCase$invoke$1.f22752a;
                AbstractC3193b.m15359b(objM15541t);
                ArrayList arrayListM22624p1 = u91.m22624p1(((Profile) objM15541t).f19669r);
                if (arrayListM22624p1.contains(str)) {
                    return xfaVar;
                }
                arrayListM22624p1.add(str);
                addDictionaryLanguageUseCase$invoke$1.f22752a = null;
                addDictionaryLanguageUseCase$invoke$1.f22755d = 2;
                if (((C1267a) ((km7) obj)).m7094x(arrayListM22624p1, addDictionaryLanguageUseCase$invoke$1) != coroutineSingletons) {
                    return xfaVar;
                }
                return coroutineSingletons;
            default:
                if (continuationImpl instanceof RemoveDictionaryLanguageUseCase$invoke$1) {
                    removeDictionaryLanguageUseCase$invoke$1 = (RemoveDictionaryLanguageUseCase$invoke$1) continuationImpl;
                    int i4 = removeDictionaryLanguageUseCase$invoke$1.f22792d;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        removeDictionaryLanguageUseCase$invoke$1.f22792d = i4 - Integer.MIN_VALUE;
                    } else {
                        removeDictionaryLanguageUseCase$invoke$1 = new RemoveDictionaryLanguageUseCase$invoke$1(this, continuationImpl);
                    }
                } else {
                    removeDictionaryLanguageUseCase$invoke$1 = new RemoveDictionaryLanguageUseCase$invoke$1(this, continuationImpl);
                }
                Object objM15541t2 = removeDictionaryLanguageUseCase$invoke$1.f22790b;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = removeDictionaryLanguageUseCase$invoke$1.f22792d;
                if (i5 == 0) {
                    AbstractC3193b.m15359b(objM15541t2);
                    qm7 qm7Var2 = ((C1369b) ((nm7) obj2)).f18480m;
                    removeDictionaryLanguageUseCase$invoke$1.f22789a = str;
                    removeDictionaryLanguageUseCase$invoke$1.f22792d = 1;
                    objM15541t2 = AbstractC3224d.m15541t(qm7Var2, removeDictionaryLanguageUseCase$invoke$1);
                    if (objM15541t2 != coroutineSingletons2) {
                    }
                    return coroutineSingletons2;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        AbstractC3193b.m15359b(objM15541t2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = removeDictionaryLanguageUseCase$invoke$1.f22789a;
                AbstractC3193b.m15359b(objM15541t2);
                ArrayList arrayListM22624p2 = u91.m22624p1(((Profile) objM15541t2).f19669r);
                if (arrayListM22624p2.isEmpty()) {
                    return xfaVar;
                }
                arrayListM22624p2.remove(str);
                removeDictionaryLanguageUseCase$invoke$1.f22789a = null;
                removeDictionaryLanguageUseCase$invoke$1.f22792d = 2;
                if (((C1267a) ((km7) obj)).m7094x(arrayListM22624p2, removeDictionaryLanguageUseCase$invoke$1) != coroutineSingletons2) {
                    return xfaVar;
                }
                return coroutineSingletons2;
        }
    }

    public C1862a(si7 si7Var, C1864c c1864c) {
        this.f22917a = 3;
        si7Var.getClass();
        this.f22918b = si7Var;
        this.f22919c = c1864c;
    }
}
