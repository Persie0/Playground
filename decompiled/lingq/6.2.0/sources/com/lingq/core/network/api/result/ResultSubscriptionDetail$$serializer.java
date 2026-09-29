package com.lingq.core.network.api.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.core.domain.model.user.AccountTier;
import com.lingq.core.domain.model.user.AccountTier$$serializer;
import com.lingq.core.domain.model.user.AndroidDetails;
import com.lingq.core.domain.model.user.AppleDetails;
import com.lingq.core.domain.model.user.FreeTrialDetails;
import com.lingq.core.domain.model.user.Invoice;
import com.lingq.core.domain.model.user.Tier;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
import p000.df1;
import p000.fa4;
import p000.l84;
import p000.lf0;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class ResultSubscriptionDetail$$serializer implements zk3 {
    public static final ResultSubscriptionDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultSubscriptionDetail$$serializer resultSubscriptionDetail$$serializer = new ResultSubscriptionDetail$$serializer();
        INSTANCE = resultSubscriptionDetail$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultSubscriptionDetail", resultSubscriptionDetail$$serializer, 22);
        bg7Var.m3702k("tier", true);
        bg7Var.m3702k("platform", true);
        bg7Var.m3702k("provider", true);
        bg7Var.m3702k("duration", true);
        bg7Var.m3702k("start_date", true);
        bg7Var.m3702k("end_date", true);
        bg7Var.m3702k("is_active", true);
        bg7Var.m3702k("reference", true);
        bg7Var.m3702k("invoice", true);
        bg7Var.m3702k("freeTrialDetails", true);
        bg7Var.m3702k("appleDetails", true);
        bg7Var.m3702k("androidDetails", true);
        bg7Var.m3702k("canSimplifyLesson", true);
        bg7Var.m3702k("isGrandfatheredSubscriber", true);
        bg7Var.m3702k("isPremium", true);
        bg7Var.m3702k("isPremiumPlus", true);
        bg7Var.m3702k("isStaff", true);
        bg7Var.m3702k("effectiveTier", true);
        bg7Var.m3702k("lynxBalance", true);
        bg7Var.m3702k("lynxLimit", true);
        bg7Var.m3702k("lynxIsUnlimited", true);
        bg7Var.m3702k("lynxIsLifetime", true);
        descriptor = bg7Var;
    }

    private ResultSubscriptionDetail$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ResultSubscriptionDetail.f21543w;
        KSerializer kSerializerM22059r = thb.m22059r((KSerializer) cs4VarArr[0].getValue());
        sk9 sk9Var = sk9.f60959a;
        KSerializer kSerializerM22059r2 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r3 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r4 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r5 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r6 = thb.m22059r(sk9Var);
        lf0 lf0Var = lf0.f49579a;
        KSerializer kSerializerM22059r7 = thb.m22059r(lf0Var);
        KSerializer kSerializerM22059r8 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r9 = thb.m22059r((KSerializer) cs4VarArr[8].getValue());
        KSerializer kSerializerM22059r10 = thb.m22059r((KSerializer) cs4VarArr[9].getValue());
        KSerializer kSerializerM22059r11 = thb.m22059r((KSerializer) cs4VarArr[10].getValue());
        KSerializer kSerializerM22059r12 = thb.m22059r((KSerializer) cs4VarArr[11].getValue());
        KSerializer kSerializerM22059r13 = thb.m22059r(lf0Var);
        KSerializer kSerializerM22059r14 = thb.m22059r(lf0Var);
        KSerializer kSerializerM22059r15 = thb.m22059r(lf0Var);
        KSerializer kSerializerM22059r16 = thb.m22059r(lf0Var);
        KSerializer kSerializerM22059r17 = thb.m22059r(lf0Var);
        KSerializer kSerializerM22059r18 = thb.m22059r(AccountTier$$serializer.INSTANCE);
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{kSerializerM22059r, kSerializerM22059r2, kSerializerM22059r3, kSerializerM22059r4, kSerializerM22059r5, kSerializerM22059r6, kSerializerM22059r7, kSerializerM22059r8, kSerializerM22059r9, kSerializerM22059r10, kSerializerM22059r11, kSerializerM22059r12, kSerializerM22059r13, kSerializerM22059r14, kSerializerM22059r15, kSerializerM22059r16, kSerializerM22059r17, kSerializerM22059r18, thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(lf0Var), thb.m22059r(lf0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultSubscriptionDetail deserialize(Decoder decoder) {
        int i;
        FreeTrialDetails freeTrialDetails;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ResultSubscriptionDetail.f21543w;
        AndroidDetails androidDetails = null;
        AppleDetails appleDetails = null;
        FreeTrialDetails freeTrialDetails2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        int i2 = 0;
        Boolean bool4 = null;
        Boolean bool5 = null;
        AccountTier accountTier = null;
        Integer num = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Integer num2 = null;
        boolean z = true;
        Tier tier = null;
        Boolean bool8 = null;
        Invoice invoice = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    freeTrialDetails2 = freeTrialDetails2;
                    androidDetails = androidDetails;
                    break;
                case 0:
                    freeTrialDetails = freeTrialDetails2;
                    tier = (Tier) df1VarMo4079b.mo4070D(serialDescriptor, 0, (KSerializer) cs4VarArr[0].getValue(), tier);
                    i2 |= 1;
                    freeTrialDetails2 = freeTrialDetails;
                    appleDetails = appleDetails;
                    androidDetails = androidDetails;
                    break;
                case 1:
                    freeTrialDetails = freeTrialDetails2;
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                    i2 |= 2;
                    freeTrialDetails2 = freeTrialDetails;
                    appleDetails = appleDetails;
                    androidDetails = androidDetails;
                    break;
                case 2:
                    freeTrialDetails = freeTrialDetails2;
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str2);
                    i2 |= 4;
                    freeTrialDetails2 = freeTrialDetails;
                    appleDetails = appleDetails;
                    androidDetails = androidDetails;
                    break;
                case 3:
                    freeTrialDetails = freeTrialDetails2;
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str3);
                    i2 |= 8;
                    freeTrialDetails2 = freeTrialDetails;
                    appleDetails = appleDetails;
                    androidDetails = androidDetails;
                    break;
                case 4:
                    freeTrialDetails = freeTrialDetails2;
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str4);
                    i2 |= 16;
                    freeTrialDetails2 = freeTrialDetails;
                    appleDetails = appleDetails;
                    androidDetails = androidDetails;
                    break;
                case 5:
                    freeTrialDetails = freeTrialDetails2;
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str5);
                    i2 |= 32;
                    freeTrialDetails2 = freeTrialDetails;
                    appleDetails = appleDetails;
                    androidDetails = androidDetails;
                    break;
                case 6:
                    freeTrialDetails = freeTrialDetails2;
                    bool8 = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 6, lf0.f49579a, bool8);
                    i2 |= 64;
                    freeTrialDetails2 = freeTrialDetails;
                    appleDetails = appleDetails;
                    androidDetails = androidDetails;
                    break;
                case 7:
                    freeTrialDetails = freeTrialDetails2;
                    str6 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str6);
                    i2 |= 128;
                    freeTrialDetails2 = freeTrialDetails;
                    appleDetails = appleDetails;
                    androidDetails = androidDetails;
                    break;
                case 8:
                    freeTrialDetails = freeTrialDetails2;
                    invoice = (Invoice) df1VarMo4079b.mo4070D(serialDescriptor, 8, (KSerializer) cs4VarArr[8].getValue(), invoice);
                    i2 |= 256;
                    freeTrialDetails2 = freeTrialDetails;
                    appleDetails = appleDetails;
                    androidDetails = androidDetails;
                    break;
                case 9:
                    androidDetails = androidDetails;
                    appleDetails = appleDetails;
                    freeTrialDetails2 = (FreeTrialDetails) df1VarMo4079b.mo4070D(serialDescriptor, 9, (KSerializer) cs4VarArr[9].getValue(), freeTrialDetails2);
                    i2 |= 512;
                    appleDetails = appleDetails;
                    androidDetails = androidDetails;
                    break;
                case 10:
                    appleDetails = (AppleDetails) df1VarMo4079b.mo4070D(serialDescriptor, 10, (KSerializer) cs4VarArr[10].getValue(), appleDetails);
                    i2 |= 1024;
                    freeTrialDetails2 = freeTrialDetails2;
                    androidDetails = androidDetails;
                    break;
                case 11:
                    appleDetails = appleDetails;
                    freeTrialDetails2 = freeTrialDetails2;
                    androidDetails = (AndroidDetails) df1VarMo4079b.mo4070D(serialDescriptor, 11, (KSerializer) cs4VarArr[11].getValue(), androidDetails);
                    i2 |= 2048;
                    freeTrialDetails2 = freeTrialDetails2;
                    appleDetails = appleDetails;
                    break;
                case 12:
                    appleDetails = appleDetails;
                    freeTrialDetails2 = freeTrialDetails2;
                    bool2 = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 12, lf0.f49579a, bool2);
                    i2 |= 4096;
                    freeTrialDetails2 = freeTrialDetails2;
                    appleDetails = appleDetails;
                    break;
                case 13:
                    appleDetails = appleDetails;
                    freeTrialDetails2 = freeTrialDetails2;
                    bool7 = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 13, lf0.f49579a, bool7);
                    i2 |= 8192;
                    freeTrialDetails2 = freeTrialDetails2;
                    appleDetails = appleDetails;
                    break;
                case 14:
                    appleDetails = appleDetails;
                    freeTrialDetails2 = freeTrialDetails2;
                    bool3 = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 14, lf0.f49579a, bool3);
                    i2 |= 16384;
                    freeTrialDetails2 = freeTrialDetails2;
                    appleDetails = appleDetails;
                    break;
                case 15:
                    bool4 = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 15, lf0.f49579a, bool4);
                    i = 32768;
                    i2 |= i;
                    freeTrialDetails2 = freeTrialDetails2;
                    appleDetails = appleDetails;
                    break;
                case 16:
                    bool5 = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 16, lf0.f49579a, bool5);
                    i = 65536;
                    i2 |= i;
                    freeTrialDetails2 = freeTrialDetails2;
                    appleDetails = appleDetails;
                    break;
                case 17:
                    accountTier = (AccountTier) df1VarMo4079b.mo4070D(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    i = 131072;
                    i2 |= i;
                    freeTrialDetails2 = freeTrialDetails2;
                    appleDetails = appleDetails;
                    break;
                case 18:
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 18, l84.f49294a, num);
                    i = 262144;
                    i2 |= i;
                    freeTrialDetails2 = freeTrialDetails2;
                    appleDetails = appleDetails;
                    break;
                case 19:
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 19, l84.f49294a, num2);
                    i = 524288;
                    i2 |= i;
                    freeTrialDetails2 = freeTrialDetails2;
                    appleDetails = appleDetails;
                    break;
                case 20:
                    bool6 = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 20, lf0.f49579a, bool6);
                    i = 1048576;
                    i2 |= i;
                    freeTrialDetails2 = freeTrialDetails2;
                    appleDetails = appleDetails;
                    break;
                case 21:
                    bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 21, lf0.f49579a, bool);
                    i = 2097152;
                    i2 |= i;
                    freeTrialDetails2 = freeTrialDetails2;
                    appleDetails = appleDetails;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultSubscriptionDetail(i2, accountTier, androidDetails, appleDetails, freeTrialDetails2, invoice, tier, bool8, bool2, bool7, bool3, bool4, bool5, bool6, bool, num, num2, str, str2, str3, str4, str5, str6);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01df  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:117:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0203  */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:78:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x016d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0184  */
    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    /* JADX WARN: Code duplicated, block: B:90:0x019e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x01bb  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultSubscriptionDetail resultSubscriptionDetail) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        encoder.getClass();
        resultSubscriptionDetail.getClass();
        Boolean bool6 = resultSubscriptionDetail.f21565v;
        Boolean bool7 = resultSubscriptionDetail.f21564u;
        Integer num = resultSubscriptionDetail.f21563t;
        Integer num2 = resultSubscriptionDetail.f21562s;
        AccountTier accountTier = resultSubscriptionDetail.f21561r;
        Boolean bool8 = resultSubscriptionDetail.f21560q;
        Boolean bool9 = resultSubscriptionDetail.f21559p;
        Boolean bool10 = resultSubscriptionDetail.f21558o;
        Boolean bool11 = resultSubscriptionDetail.f21557n;
        Boolean bool12 = resultSubscriptionDetail.f21556m;
        AndroidDetails androidDetails = resultSubscriptionDetail.f21555l;
        AppleDetails appleDetails = resultSubscriptionDetail.f21554k;
        FreeTrialDetails freeTrialDetails = resultSubscriptionDetail.f21553j;
        Invoice invoice = resultSubscriptionDetail.f21552i;
        String str = resultSubscriptionDetail.f21551h;
        Boolean bool13 = resultSubscriptionDetail.f21550g;
        String str2 = resultSubscriptionDetail.f21549f;
        String str3 = resultSubscriptionDetail.f21548e;
        String str4 = resultSubscriptionDetail.f21547d;
        String str5 = resultSubscriptionDetail.f21546c;
        String str6 = resultSubscriptionDetail.f21545b;
        Tier tier = resultSubscriptionDetail.f21544a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ResultSubscriptionDetail.f21543w;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || tier != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, (KSerializer) cs4VarArr[0].getValue(), tier);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str6 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str5 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || bool13 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, lf0.f49579a, bool13);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || invoice != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, (KSerializer) cs4VarArr[8].getValue(), invoice);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || freeTrialDetails != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, (KSerializer) cs4VarArr[9].getValue(), freeTrialDetails);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || appleDetails != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 10, (KSerializer) cs4VarArr[10].getValue(), appleDetails);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || androidDetails != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 11, (KSerializer) cs4VarArr[11].getValue(), androidDetails);
        }
        if (!mk9VarMo15606b.m16872B(serialDescriptor)) {
            bool = bool12;
            if (!fa4.m11650l(bool, Boolean.FALSE)) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                bool2 = bool11;
                if (!fa4.m11650l(bool2, Boolean.FALSE)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    bool3 = bool10;
                    if (!fa4.m11650l(bool3, Boolean.FALSE)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        bool4 = bool9;
                        if (!fa4.m11650l(bool4, Boolean.FALSE)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            bool5 = bool8;
                            if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor) || accountTier != null) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor) || num2 != null) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor) || bool7 != null) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor) || bool6 != null) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        bool5 = bool8;
                        mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    bool4 = bool9;
                    mk9VarMo15606b.m16880x(serialDescriptor, 15, lf0.f49579a, bool4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        bool5 = bool8;
                        if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    bool5 = bool8;
                    mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                bool3 = bool10;
                mk9VarMo15606b.m16880x(serialDescriptor, 14, lf0.f49579a, bool3);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    bool4 = bool9;
                    if (!fa4.m11650l(bool4, Boolean.FALSE)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        bool5 = bool8;
                        if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    bool5 = bool8;
                    mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                bool4 = bool9;
                mk9VarMo15606b.m16880x(serialDescriptor, 15, lf0.f49579a, bool4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    bool5 = bool8;
                    if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                bool5 = bool8;
                mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            bool2 = bool11;
            mk9VarMo15606b.m16880x(serialDescriptor, 13, lf0.f49579a, bool2);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                bool3 = bool10;
                if (!fa4.m11650l(bool3, Boolean.FALSE)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    bool4 = bool9;
                    if (!fa4.m11650l(bool4, Boolean.FALSE)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        bool5 = bool8;
                        if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    bool5 = bool8;
                    mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                bool4 = bool9;
                mk9VarMo15606b.m16880x(serialDescriptor, 15, lf0.f49579a, bool4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    bool5 = bool8;
                    if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                bool5 = bool8;
                mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            bool3 = bool10;
            mk9VarMo15606b.m16880x(serialDescriptor, 14, lf0.f49579a, bool3);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                bool4 = bool9;
                if (!fa4.m11650l(bool4, Boolean.FALSE)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    bool5 = bool8;
                    if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                bool5 = bool8;
                mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            bool4 = bool9;
            mk9VarMo15606b.m16880x(serialDescriptor, 15, lf0.f49579a, bool4);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                bool5 = bool8;
                if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            bool5 = bool8;
            mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        bool = bool12;
        mk9VarMo15606b.m16880x(serialDescriptor, 12, lf0.f49579a, bool);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            bool2 = bool11;
            if (!fa4.m11650l(bool2, Boolean.FALSE)) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                bool3 = bool10;
                if (!fa4.m11650l(bool3, Boolean.FALSE)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    bool4 = bool9;
                    if (!fa4.m11650l(bool4, Boolean.FALSE)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        bool5 = bool8;
                        if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    bool5 = bool8;
                    mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                bool4 = bool9;
                mk9VarMo15606b.m16880x(serialDescriptor, 15, lf0.f49579a, bool4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    bool5 = bool8;
                    if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                bool5 = bool8;
                mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            bool3 = bool10;
            mk9VarMo15606b.m16880x(serialDescriptor, 14, lf0.f49579a, bool3);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                bool4 = bool9;
                if (!fa4.m11650l(bool4, Boolean.FALSE)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    bool5 = bool8;
                    if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                bool5 = bool8;
                mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            bool4 = bool9;
            mk9VarMo15606b.m16880x(serialDescriptor, 15, lf0.f49579a, bool4);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                bool5 = bool8;
                if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            bool5 = bool8;
            mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        bool2 = bool11;
        mk9VarMo15606b.m16880x(serialDescriptor, 13, lf0.f49579a, bool2);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            bool3 = bool10;
            if (!fa4.m11650l(bool3, Boolean.FALSE)) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                bool4 = bool9;
                if (!fa4.m11650l(bool4, Boolean.FALSE)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    bool5 = bool8;
                    if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                bool5 = bool8;
                mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            bool4 = bool9;
            mk9VarMo15606b.m16880x(serialDescriptor, 15, lf0.f49579a, bool4);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                bool5 = bool8;
                if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            bool5 = bool8;
            mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        bool3 = bool10;
        mk9VarMo15606b.m16880x(serialDescriptor, 14, lf0.f49579a, bool3);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            bool4 = bool9;
            if (!fa4.m11650l(bool4, Boolean.FALSE)) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                bool5 = bool8;
                if (!fa4.m11650l(bool5, Boolean.FALSE)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            bool5 = bool8;
            mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        bool4 = bool9;
        mk9VarMo15606b.m16880x(serialDescriptor, 15, lf0.f49579a, bool4);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            bool5 = bool8;
            if (!fa4.m11650l(bool5, Boolean.FALSE)) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        bool5 = bool8;
        mk9VarMo15606b.m16880x(serialDescriptor, 16, lf0.f49579a, bool5);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 17, AccountTier$$serializer.INSTANCE, accountTier);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 20, lf0.f49579a, bool7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 21, lf0.f49579a, bool6);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
