package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.C2978ev;
import p000.bg7;
import p000.df1;
import p000.fa4;
import p000.l84;
import p000.mk9;
import p000.sk9;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class Results$$serializer<ResultType> implements zk3 {
    private final SerialDescriptor descriptor;
    private final /* synthetic */ KSerializer typeSerial0;

    private Results$$serializer() {
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.Results", this, 4);
        bg7Var.m3702k("count", true);
        bg7Var.m3702k("next", true);
        bg7Var.m3702k("previous", true);
        bg7Var.m3702k("results", true);
        this.descriptor = bg7Var;
    }

    private final /* synthetic */ KSerializer getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84.f49294a, thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(new C2978ev(this.typeSerial0))};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Results<ResultType> deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = this.descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String str = null;
        String str2 = null;
        List list = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                i |= 2;
            } else if (iMo10319A == 2) {
                str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str2);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                list = (List) df1VarMo4079b.mo4070D(serialDescriptor, 3, new C2978ev(this.typeSerial0), list);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        Results<ResultType> results = new Results<>();
        if ((i & 1) == 0) {
            results.f21736a = 0;
        } else {
            results.f21736a = iMo4091q;
        }
        if ((i & 2) == 0) {
            results.f21737b = null;
        } else {
            results.f21737b = str;
        }
        if ((i & 4) == 0) {
            results.f21738c = null;
        } else {
            results.f21738c = str2;
        }
        if ((i & 8) == 0) {
            results.f21739d = EmptyList.f47638a;
            return results;
        }
        results.f21739d = list;
        return results;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Results<ResultType> results) {
        encoder.getClass();
        results.getClass();
        List list = results.f21739d;
        String str = results.f21738c;
        String str2 = results.f21737b;
        int i = results.f21736a;
        SerialDescriptor serialDescriptor = this.descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        KSerializer kSerializer = this.typeSerial0;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, EmptyList.f47638a)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, new C2978ev(kSerializer), list);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public final KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Results$$serializer(KSerializer kSerializer) {
        this();
        kSerializer.getClass();
        this.typeSerial0 = kSerializer;
    }
}
