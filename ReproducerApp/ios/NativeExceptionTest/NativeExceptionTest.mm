//
//  NativeExceptionTest.m
//  ReproducerApp
//
//  Created by Sean Carpenter on 9/25/25.
//

#import "NativeExceptionTest.h"

@implementation NativeExceptionTest
-(id) init {
  if (self = [super init]) {
  }
  return self;
}

-(std::shared_ptr<facebook::react::TurboModule>)getTurboModule:(const facebook::react::ObjCTurboModule::InitParams &)params {
  return std::make_shared<facebook::react::NativeExceptionTestSpecJSI>(params);
}

-(NSNumber*) nonVoidFunction {
  @throw [NSException exceptionWithName:@"ExceptionTestNonVoid" reason:@"Exception handled in Javascript" userInfo:nil];
  
  return [NSNumber numberWithBool: YES];
}

-(void) voidFunction {
  @throw [NSException exceptionWithName:@"ExceptionTestVoid" reason:@"Exception crashes app" userInfo:nil];
}

+ (NSString*) moduleName {
  return @"NativeExceptionTest";
}

@end
