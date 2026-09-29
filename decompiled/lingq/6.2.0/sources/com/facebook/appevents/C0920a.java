package com.facebook.appevents;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import p000.fa4;

/* JADX INFO: renamed from: com.facebook.appevents.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0920a extends ObjectInputStream {
    public C0920a(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    @Override // java.io.ObjectInputStream
    public final ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
        ObjectStreamClass classDescriptor = super.readClassDescriptor();
        if (fa4.m11650l(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
            classDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
        } else if (fa4.m11650l(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
            classDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
        }
        classDescriptor.getClass();
        return classDescriptor;
    }
}
