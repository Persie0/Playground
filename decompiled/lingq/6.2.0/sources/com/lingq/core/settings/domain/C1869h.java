package com.lingq.core.settings.domain;

import com.lingq.core.data.profile.C1267a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.user.ProfileSettings;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b09;
import p000.fa4;
import p000.gm5;
import p000.km7;
import p000.si7;
import p000.vi7;
import p000.xfa;
import p000.zz7;

/* JADX INFO: renamed from: com.lingq.core.settings.domain.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C1869h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22944a;

    /* JADX INFO: renamed from: b */
    public final si7 f22945b;

    /* JADX INFO: renamed from: c */
    public final km7 f22946c;

    public C1869h(si7 si7Var, km7 km7Var, int i) {
        this.f22944a = i;
        si7Var.getClass();
        km7Var.getClass();
        switch (i) {
            case 1:
                this.f22945b = si7Var;
                this.f22946c = km7Var;
                break;
            case 2:
                this.f22945b = si7Var;
                this.f22946c = km7Var;
                break;
            case 3:
                this.f22945b = si7Var;
                this.f22946c = km7Var;
                break;
            case 4:
                this.f22945b = si7Var;
                this.f22946c = km7Var;
                break;
            case 5:
                this.f22945b = si7Var;
                this.f22946c = km7Var;
                break;
            case 6:
                this.f22945b = si7Var;
                this.f22946c = km7Var;
                break;
            default:
                this.f22945b = si7Var;
                this.f22946c = km7Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x011c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0121  */
    /* JADX WARN: Code duplicated, block: B:38:0x0125  */
    /* JADX WARN: Code duplicated, block: B:39:0x012a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public Object m8632a(LqTheme lqTheme, ContinuationImpl continuationImpl) throws Throwable {
        SetThemeUseCase$invoke$1 setThemeUseCase$invoke$1;
        LqTheme lqTheme2;
        String str;
        int i;
        String str2;
        LqTheme lqTheme3 = lqTheme;
        if (continuationImpl instanceof SetThemeUseCase$invoke$1) {
            setThemeUseCase$invoke$1 = (SetThemeUseCase$invoke$1) continuationImpl;
            int i2 = setThemeUseCase$invoke$1.f22845d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setThemeUseCase$invoke$1.f22845d = i2 - Integer.MIN_VALUE;
            } else {
                setThemeUseCase$invoke$1 = new SetThemeUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            setThemeUseCase$invoke$1 = new SetThemeUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = setThemeUseCase$invoke$1.f22843b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = setThemeUseCase$invoke$1.f22845d;
        xfa xfaVar = xfa.f68157a;
        si7 si7Var = this.f22945b;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            setThemeUseCase$invoke$1.f22842a = lqTheme3;
            setThemeUseCase$invoke$1.f22845d = 1;
            if (((C1368a) si7Var).m7882h0(lqTheme3, setThemeUseCase$invoke$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            lqTheme3 = setThemeUseCase$invoke$1.f22842a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i3 == 2) {
                lqTheme2 = setThemeUseCase$invoke$1.f22842a;
                AbstractC3193b.m15359b(objM15541t);
                vi7 vi7Var = ((C1368a) si7Var).f18463y0;
                setThemeUseCase$invoke$1.f22842a = lqTheme2;
                setThemeUseCase$invoke$1.f22845d = 3;
                objM15541t = AbstractC3224d.m15541t(vi7Var, setThemeUseCase$invoke$1);
                if (objM15541t != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    AbstractC3193b.m15359b(objM15541t);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lqTheme2 = setThemeUseCase$invoke$1.f22842a;
            AbstractC3193b.m15359b(objM15541t);
        }
        str = (String) objM15541t;
        i = b09.f7734a[lqTheme2.ordinal()];
        if (i != 1) {
            str2 = zz7.f72427b.f70705a;
        } else if (i != 2) {
            str2 = zz7.f72429d.f70705a;
        } else {
            if (i == 3) {
                gm5.m12750e();
                return null;
            }
            str2 = zz7.f72428c.f70705a;
        }
        if (!fa4.m11650l(str, str2)) {
            setThemeUseCase$invoke$1.f22842a = null;
            setThemeUseCase$invoke$1.f22845d = 4;
            if (((C1368a) si7Var).m7859R(str2, setThemeUseCase$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        String lowerCase = lqTheme3.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        ProfileSettings profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lowerCase, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, -1, 16777215);
        setThemeUseCase$invoke$1.f22842a = lqTheme3;
        setThemeUseCase$invoke$1.f22845d = 2;
        ((C1267a) this.f22946c).m7061B(profileSettings);
        if (xfaVar != coroutineSingletons) {
            lqTheme2 = lqTheme3;
            vi7 vi7Var2 = ((C1368a) si7Var).f18463y0;
            setThemeUseCase$invoke$1.f22842a = lqTheme2;
            setThemeUseCase$invoke$1.f22845d = 3;
            objM15541t = AbstractC3224d.m15541t(vi7Var2, setThemeUseCase$invoke$1);
            if (objM15541t != coroutineSingletons) {
                str = (String) objM15541t;
                i = b09.f7734a[lqTheme2.ordinal()];
                if (i != 1) {
                    str2 = zz7.f72427b.f70705a;
                } else if (i != 2) {
                    str2 = zz7.f72429d.f70705a;
                } else {
                    if (i == 3) {
                        gm5.m12750e();
                        return null;
                    }
                    str2 = zz7.f72428c.f70705a;
                }
                if (!fa4.m11650l(str, str2)) {
                    setThemeUseCase$invoke$1.f22842a = null;
                    setThemeUseCase$invoke$1.f22845d = 4;
                    if (((C1368a) si7Var).m7859R(str2, setThemeUseCase$invoke$1) == coroutineSingletons) {
                    }
                }
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:104:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:115:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:121:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:122:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:138:0x048b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0496  */
    /* JADX WARN: Code duplicated, block: B:142:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:143:0x0530  */
    /* JADX WARN: Code duplicated, block: B:145:0x053e  */
    /* JADX WARN: Code duplicated, block: B:146:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:148:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:149:0x0644  */
    /* JADX WARN: Code duplicated, block: B:151:0x0650  */
    /* JADX WARN: Code duplicated, block: B:152:0x06da  */
    /* JADX WARN: Code duplicated, block: B:154:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:155:0x0770  */
    /* JADX WARN: Code duplicated, block: B:157:0x077c  */
    /* JADX WARN: Code duplicated, block: B:158:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:160:0x0800  */
    /* JADX WARN: Code duplicated, block: B:161:0x087a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0886  */
    /* JADX WARN: Code duplicated, block: B:164:0x0905  */
    /* JADX WARN: Code duplicated, block: B:166:0x0911  */
    /* JADX WARN: Code duplicated, block: B:167:0x0992  */
    /* JADX WARN: Code duplicated, block: B:169:0x099e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:172:0x0a2d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0ab2  */
    /* JADX WARN: Code duplicated, block: B:175:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:176:0x0b44 A[PHI: r3
      0x0b44: PHI (r3v14 boolean) = (r3v0 boolean), (r3v16 boolean) binds: [B:125:0x0449, B:174:0x0abc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:178:0x0b47  */
    /* JADX WARN: Code duplicated, block: B:180:0x0b59 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:185:0x03bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0134  */
    /* JADX WARN: Code duplicated, block: B:66:0x014b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    /* JADX WARN: Code duplicated, block: B:79:0x0207  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:85:0x021e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0229  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d9  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v35 java.lang.Object, still in use, count: 2, list:
          (r7v35 java.lang.Object) from 0x0487: PHI (r7 I:??) = (r7v32 java.lang.Object), (r7v35 java.lang.Object) binds: [B:135:0x0486, B:183:0x0487] A[DONT_GENERATE, DONT_INLINE]
          (r7v35 java.lang.Object) from 0x0479: CHECK_CAST (com.lingq.core.domain.model.settings.LatinScript) (r7v35 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: b */
    public java.lang.Object m8633b(java.lang.String r72, java.lang.String r73, boolean r74, kotlin.coroutines.jvm.internal.ContinuationImpl r75) {
        /*
            Method dump skipped, instruction units count: 2928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.settings.domain.C1869h.m8633b(java.lang.String, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x028f  */
    /* JADX WARN: Code duplicated, block: B:93:0x035b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0412, code lost:
    
        if (r11 == r2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e2, code lost:
    
        if (r11 == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ae, code lost:
    
        if (r11 == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x027a, code lost:
    
        if (r11 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0346, code lost:
    
        if (r11 == r2) goto L86;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8634c(boolean z, ContinuationImpl continuationImpl) throws Throwable {
        SetShowSpacesBetweenWordsSettingUseCase$invoke$1 setShowSpacesBetweenWordsSettingUseCase$invoke$1;
        SetShowVocabularySettingUseCase$invoke$1 setShowVocabularySettingUseCase$invoke$1;
        SetStatusBarSettingUseCase$invoke$1 setStatusBarSettingUseCase$invoke$1;
        SetTimezoneAlertUseCase$invoke$1 setTimezoneAlertUseCase$invoke$1;
        SetTransliterationStatusSettingUseCase$invoke$1 setTransliterationStatusSettingUseCase$invoke$1;
        boolean z2 = z;
        int i = this.f22944a;
        km7 km7Var = this.f22946c;
        si7 si7Var = this.f22945b;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                if (continuationImpl instanceof SetShowSpacesBetweenWordsSettingUseCase$invoke$1) {
                    setShowSpacesBetweenWordsSettingUseCase$invoke$1 = (SetShowSpacesBetweenWordsSettingUseCase$invoke$1) continuationImpl;
                    int i2 = setShowSpacesBetweenWordsSettingUseCase$invoke$1.f22833d;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        setShowSpacesBetweenWordsSettingUseCase$invoke$1.f22833d = i2 - Integer.MIN_VALUE;
                    } else {
                        setShowSpacesBetweenWordsSettingUseCase$invoke$1 = new SetShowSpacesBetweenWordsSettingUseCase$invoke$1(this, continuationImpl);
                    }
                } else {
                    setShowSpacesBetweenWordsSettingUseCase$invoke$1 = new SetShowSpacesBetweenWordsSettingUseCase$invoke$1(this, continuationImpl);
                }
                Object obj = setShowSpacesBetweenWordsSettingUseCase$invoke$1.f22831b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = setShowSpacesBetweenWordsSettingUseCase$invoke$1.f22833d;
                if (i3 == 0) {
                    AbstractC3193b.m15359b(obj);
                    setShowSpacesBetweenWordsSettingUseCase$invoke$1.f22830a = z2;
                    setShowSpacesBetweenWordsSettingUseCase$invoke$1.f22833d = 1;
                    if (((C1368a) si7Var).m7866Y(z2, setShowSpacesBetweenWordsSettingUseCase$invoke$1) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i3 == 1) {
                    z2 = setShowSpacesBetweenWordsSettingUseCase$invoke$1.f22830a;
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i3 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfaVar;
                ProfileSettings profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z2), null, null, null, null, null, null, null, null, null, null, -1, -1, 16777087);
                setShowSpacesBetweenWordsSettingUseCase$invoke$1.f22830a = z2;
                setShowSpacesBetweenWordsSettingUseCase$invoke$1.f22833d = 2;
                ((C1267a) km7Var).m7061B(profileSettings);
                break;
            case 1:
                if (continuationImpl instanceof SetShowVocabularySettingUseCase$invoke$1) {
                    setShowVocabularySettingUseCase$invoke$1 = (SetShowVocabularySettingUseCase$invoke$1) continuationImpl;
                    int i4 = setShowVocabularySettingUseCase$invoke$1.f22837d;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        setShowVocabularySettingUseCase$invoke$1.f22837d = i4 - Integer.MIN_VALUE;
                    } else {
                        setShowVocabularySettingUseCase$invoke$1 = new SetShowVocabularySettingUseCase$invoke$1(this, continuationImpl);
                    }
                } else {
                    setShowVocabularySettingUseCase$invoke$1 = new SetShowVocabularySettingUseCase$invoke$1(this, continuationImpl);
                }
                Object obj2 = setShowVocabularySettingUseCase$invoke$1.f22835b;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = setShowVocabularySettingUseCase$invoke$1.f22837d;
                if (i5 == 0) {
                    AbstractC3193b.m15359b(obj2);
                    setShowVocabularySettingUseCase$invoke$1.f22834a = z2;
                    setShowVocabularySettingUseCase$invoke$1.f22837d = 1;
                    if (((C1368a) si7Var).m7870b0(z2, setShowVocabularySettingUseCase$invoke$1) != coroutineSingletons2) {
                    }
                    return coroutineSingletons2;
                }
                if (i5 == 1) {
                    z2 = setShowVocabularySettingUseCase$invoke$1.f22834a;
                    AbstractC3193b.m15359b(obj2);
                } else {
                    if (i5 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj2);
                }
                return xfaVar;
                ProfileSettings profileSettings2 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z2), null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777151);
                setShowVocabularySettingUseCase$invoke$1.f22834a = z2;
                setShowVocabularySettingUseCase$invoke$1.f22837d = 2;
                ((C1267a) km7Var).m7061B(profileSettings2);
                break;
            case 2:
                if (continuationImpl instanceof SetStatusBarSettingUseCase$invoke$1) {
                    setStatusBarSettingUseCase$invoke$1 = (SetStatusBarSettingUseCase$invoke$1) continuationImpl;
                    int i6 = setStatusBarSettingUseCase$invoke$1.f22841d;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        setStatusBarSettingUseCase$invoke$1.f22841d = i6 - Integer.MIN_VALUE;
                    } else {
                        setStatusBarSettingUseCase$invoke$1 = new SetStatusBarSettingUseCase$invoke$1(this, continuationImpl);
                    }
                } else {
                    setStatusBarSettingUseCase$invoke$1 = new SetStatusBarSettingUseCase$invoke$1(this, continuationImpl);
                }
                Object obj3 = setStatusBarSettingUseCase$invoke$1.f22839b;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = setStatusBarSettingUseCase$invoke$1.f22841d;
                if (i7 == 0) {
                    AbstractC3193b.m15359b(obj3);
                    setStatusBarSettingUseCase$invoke$1.f22838a = z2;
                    setStatusBarSettingUseCase$invoke$1.f22841d = 1;
                    if (((C1368a) si7Var).m7872c0(z2, setStatusBarSettingUseCase$invoke$1) != coroutineSingletons3) {
                    }
                    return coroutineSingletons3;
                }
                if (i7 == 1) {
                    z2 = setStatusBarSettingUseCase$invoke$1.f22838a;
                    AbstractC3193b.m15359b(obj3);
                } else {
                    if (i7 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj3);
                }
                return xfaVar;
                ProfileSettings profileSettings3 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z2), null, null, null, null, null, null, null, null, -1, -1, 16776703);
                setStatusBarSettingUseCase$invoke$1.f22838a = z2;
                setStatusBarSettingUseCase$invoke$1.f22841d = 2;
                ((C1267a) km7Var).m7061B(profileSettings3);
                break;
            case 3:
            default:
                if (continuationImpl instanceof SetTransliterationStatusSettingUseCase$invoke$1) {
                    setTransliterationStatusSettingUseCase$invoke$1 = (SetTransliterationStatusSettingUseCase$invoke$1) continuationImpl;
                    int i8 = setTransliterationStatusSettingUseCase$invoke$1.f22853d;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        setTransliterationStatusSettingUseCase$invoke$1.f22853d = i8 - Integer.MIN_VALUE;
                    } else {
                        setTransliterationStatusSettingUseCase$invoke$1 = new SetTransliterationStatusSettingUseCase$invoke$1(this, continuationImpl);
                    }
                } else {
                    setTransliterationStatusSettingUseCase$invoke$1 = new SetTransliterationStatusSettingUseCase$invoke$1(this, continuationImpl);
                }
                Object obj4 = setTransliterationStatusSettingUseCase$invoke$1.f22851b;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = setTransliterationStatusSettingUseCase$invoke$1.f22853d;
                if (i9 == 0) {
                    AbstractC3193b.m15359b(obj4);
                    setTransliterationStatusSettingUseCase$invoke$1.f22850a = z2;
                    setTransliterationStatusSettingUseCase$invoke$1.f22853d = 1;
                    if (((C1368a) si7Var).m7896o0(z2, setTransliterationStatusSettingUseCase$invoke$1) != coroutineSingletons4) {
                    }
                    return coroutineSingletons4;
                }
                if (i9 == 1) {
                    z2 = setTransliterationStatusSettingUseCase$invoke$1.f22850a;
                    AbstractC3193b.m15359b(obj4);
                } else {
                    if (i9 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj4);
                }
                return xfaVar;
                ProfileSettings profileSettings4 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(!z2), null, null, null, null, null, null, null, null, null, -1, -1, 16776959);
                setTransliterationStatusSettingUseCase$invoke$1.f22850a = z2;
                setTransliterationStatusSettingUseCase$invoke$1.f22853d = 2;
                ((C1267a) km7Var).m7061B(profileSettings4);
                break;
            case 4:
                if (continuationImpl instanceof SetTimezoneAlertUseCase$invoke$1) {
                    setTimezoneAlertUseCase$invoke$1 = (SetTimezoneAlertUseCase$invoke$1) continuationImpl;
                    int i10 = setTimezoneAlertUseCase$invoke$1.f22849d;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        setTimezoneAlertUseCase$invoke$1.f22849d = i10 - Integer.MIN_VALUE;
                    } else {
                        setTimezoneAlertUseCase$invoke$1 = new SetTimezoneAlertUseCase$invoke$1(this, continuationImpl);
                    }
                } else {
                    setTimezoneAlertUseCase$invoke$1 = new SetTimezoneAlertUseCase$invoke$1(this, continuationImpl);
                }
                Object obj5 = setTimezoneAlertUseCase$invoke$1.f22847b;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = setTimezoneAlertUseCase$invoke$1.f22849d;
                if (i11 == 0) {
                    AbstractC3193b.m15359b(obj5);
                    setTimezoneAlertUseCase$invoke$1.f22846a = z2;
                    setTimezoneAlertUseCase$invoke$1.f22849d = 1;
                    if (((C1368a) si7Var).m7868a0(z2, setTimezoneAlertUseCase$invoke$1) != coroutineSingletons5) {
                    }
                    return coroutineSingletons5;
                }
                if (i11 == 1) {
                    z2 = setTimezoneAlertUseCase$invoke$1.f22846a;
                    AbstractC3193b.m15359b(obj5);
                } else {
                    if (i11 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj5);
                }
                return xfaVar;
                ProfileSettings profileSettings5 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z2), null, null, null, null, null, -1, -1, 16711679);
                setTimezoneAlertUseCase$invoke$1.f22846a = z2;
                setTimezoneAlertUseCase$invoke$1.f22849d = 2;
                ((C1267a) km7Var).m7061B(profileSettings5);
                break;
        }
    }
}
