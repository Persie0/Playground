package com.amplitude.core.utilities;

import com.amplitude.android.storage.C0898b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.a84;
import p000.c32;
import p000.h84;
import p000.l70;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.amplitude.core.utilities.FileResponseHandler$handlePayloadTooLargeResponse$2", m4291f = "FileResponseHandler.kt", m4292l = {}, m4293m = "invokeSuspend")
final class FileResponseHandler$handlePayloadTooLargeResponse$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0915c f11231a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f11232b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ JSONArray f11233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileResponseHandler$handlePayloadTooLargeResponse$2(C0915c c0915c, String str, JSONArray jSONArray, Continuation continuation) {
        super(2, continuation);
        this.f11231a = c0915c;
        this.f11232b = str;
        this.f11233c = jSONArray;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FileResponseHandler$handlePayloadTooLargeResponse$2(this.f11231a, this.f11232b, this.f11233c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FileResponseHandler$handlePayloadTooLargeResponse$2 fileResponseHandler$handlePayloadTooLargeResponse$2 = (FileResponseHandler$handlePayloadTooLargeResponse$2) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        fileResponseHandler$handlePayloadTooLargeResponse$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0898b c0898b = this.f11231a.f11264a;
        c0898b.getClass();
        String str = this.f11232b;
        str.getClass();
        C0913a c0913a = c0898b.f10992d;
        File file = c0913a.f11251a;
        File file2 = new File(str);
        if (file2.exists()) {
            String name = file2.getName();
            File file3 = new File(file, ux5.m22990m(name, "-1.tmp"));
            File file4 = new File(file, ux5.m22990m(name, "-2.tmp"));
            JSONArray jSONArray = this.f11233c;
            int length = jSONArray.length() / 2;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = l70.m15922M(0, jSONArray.length()).iterator();
            while (((h84) it).f41941c) {
                int iNextInt = ((a84) it).nextInt();
                if (iNextInt < length) {
                    JSONObject jSONObject = jSONArray.getJSONObject(iNextInt);
                    jSONObject.getClass();
                    arrayList.add(jSONObject);
                } else {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(iNextInt);
                    jSONObject2.getClass();
                    arrayList2.add(jSONObject2);
                }
            }
            c0913a.m5165m(arrayList, file3, true);
            c0913a.m5165m(arrayList2, file4, true);
            c0913a.m5160h(str);
        }
        return xfa.f68157a;
    }
}
